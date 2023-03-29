package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class conector {

    private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bdfloreria?serverTimezone=UTC";
    //private static final String URL = "jdbc:mysql://localhost:3306/bdfloreria";
    private static final String USUARIO = "root";
    private static final String CLAVE = "antares/128";

    static {
        try {
            Class.forName(CONTROLADOR);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
            e.printStackTrace();
        }
    }

    public Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conexión OK");
        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }
        return conexion;
    }

    public int ejecutarProcedimientoSinDatos(String consulta) {
        Connection cn = null;
        Statement stm = null;
        int sqlState = 0;
        try {
            cn = this.conectar();
            stm = cn.createStatement();
            stm.executeQuery(consulta);
        } catch (SQLException e) {
            //e.printStackTrace();
            sqlState = Integer.parseInt(e.getSQLState());
            System.out.println("Código Error: " + sqlState);
        }
        return sqlState;
    }
    public List<List<String>> ejecutarProcedimientoConDatos(String select) {
        Connection cn = null;
        Statement stm = null;
        ResultSet rs = null;
        List<List<String>> objetos = new ArrayList<List<String>>();
        try {
            cn = this.conectar();
            stm = cn.createStatement();
            rs = stm.executeQuery( select );
            while (rs.next()) {
                List <String> l = new ArrayList<String>();
                boolean flag = true;
                try {
                    int cont = 1;
                    while(flag) {
                        l.add(rs.getString(cont));
                        cont++;
                    }
                } catch (Exception e) {
                    flag = false;
                }
                objetos.add(l);
            }
        } catch ( SQLException e ) {
            e.printStackTrace();
        } finally {
            try {
                if(rs!=null ) {
                    rs.close();
                }
                if (stm != null) {
                    stm.close();
                }

                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return objetos;
    }
    /**/

}

