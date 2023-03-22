import Conexion.conector;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrincipalFloreriaBD {
    private static List<List<String>> data = new ArrayList<List<String>>();
    public static void main(String[] args) {
        conector c = new conector();
//        c.conectar();
        data = c.ejecutarProcedimientoConDatos("call listarVendedores()");

        c.ejecutarProcedimientoSinDatos("call crearFlor("+
                "'" + "Orquidea Silvestre" + "', " +
                "'" + "Tierra mojada" + "', " +
                "'" + "Purpura" + "', " +
                "" + 35 + ", " +
                "" + 200 + ", " +
                "'" + "2023-02-15 12:00:15" + "', " +
                "'" + "Activo" + "' " +
                ")");

        /*
        *   pnombre varchar(75),
            paroma varchar(45),
            pcolor varchar(45),
            pprecio double,
            pstock int,
            pfcreacion datetime,
            pestado varchar(12)
        * */

        for (List<String> dato: data ) {
            System.out.print(dato.get(0)+" ");
            System.out.print(dato.get(1)+" ");
            System.out.print(dato.get(2)+" ");
            System.out.print(dato.get(3)+" ");
            System.out.print(dato.get(4)+" ");
            System.out.print(dato.get(5)+"\n");
        }

        c.ejecutarProcedimientoSinDatos("call eliminarFlor('6')");

        data = c.ejecutarProcedimientoConDatos("call listarFlores()");

        for (List<String> dato: data ) {
            System.out.print(dato.get(0)+" ");
            System.out.print(dato.get(1)+" ");
            System.out.print(dato.get(2)+" ");
            System.out.print(dato.get(3)+" ");
            System.out.print(dato.get(4)+" ");
            System.out.print(dato.get(5)+" ");
            System.out.print(dato.get(6)+" ");
            System.out.print(dato.get(7)+"\n");
        }

        SimpleDateFormat fechaMySQL = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println(fechaMySQL.format(new Date()));

    }
}