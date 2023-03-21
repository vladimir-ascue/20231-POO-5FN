package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.spi.LocaleNameProvider;

public class crudFlor extends JFrame {
    private JPanel panel;
    private JLabel idflor;
    private JTextField nombre;
    private JTextField aroma;
    private JTextField color;
    private JTextField precio;
    private JTextField stock;
    private SpinnerDateModel fcreacion;
    private JTextField estado;

    private JLabel lbnombre;
    private JLabel lbaroma;
    private JLabel lbcolor;
    private JLabel lbprecio;
    private JLabel lbstock;
    private JLabel lbfcreacion;
    private JLabel lbestado;

    private JButton btGuardar = new JButton();
    private JButton btActualizar = new JButton();
    private JButton btLimpiar = new JButton();
    public crudFlor(){
        setSize(550, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        inicializarComponentes();
        cargarEventos();
    }

    public void inicializarComponentes(){
        panel = new JPanel();
        panel.setLayout(null);


        idflor = new JLabel();
        idflor.setText("...");
        idflor.setBounds(30,30, 150,45);

        lbnombre = new JLabel();
        lbnombre.setText("nombre");
        lbnombre.setBounds(30,90, 150,45);

        nombre = new JTextField();
        nombre.setText("Nombre");
        nombre.setBounds(180,90, 150,45);

        lbaroma = new JLabel();
        lbaroma.setText("Aroma");
        lbaroma.setBounds(30,140, 150,45);

        aroma = new JTextField();
        aroma.setText("Aroma");
        aroma.setBounds(180,140, 150,45);

        lbcolor = new JLabel();
        lbcolor.setText("Color");
        lbcolor.setBounds(30,190, 150,45);

        color = new JTextField();
        color.setText("Color");
        color.setBounds(180, 190, 150,45);

        lbprecio = new JLabel();
        lbprecio.setText("Precio");
        lbprecio.setBounds(30,240, 150,45);

        precio = new JTextField();
        precio.setText("Precio");
        precio.setBounds(180,240, 150,45);

        lbstock = new JLabel();
        lbstock.setText("Stock");
        lbstock.setBounds(30,290, 150,45);

        stock = new JTextField();
        stock.setText("Stock");
        stock.setBounds(180,290, 150,45);

        fcreacion = new SpinnerDateModel();

        lbestado = new JLabel();
        lbestado.setText("Precio");
        lbestado.setBounds(30,340, 150,45);

        estado = new JTextField();
        estado.setText("Estado");
        estado.setBounds(180,340, 150,45);

        btGuardar.setText("Guardar");
        btGuardar.setBounds(50,390, 150,45);

        btActualizar.setText("Actualizar");
        btActualizar.setBounds(230,390, 150,45);

        btLimpiar.setText("limpiar");
        btLimpiar.setBounds(510,390, 150,45);

        panel.add(idflor);
        panel.add(nombre);
        panel.add(aroma);
        panel.add(color);
        panel.add(precio);
        panel.add(stock);
        panel.add(lbnombre);
        panel.add(lbaroma);
        panel.add(lbcolor);
        panel.add(lbprecio);
        panel.add(lbstock);
        // panel.add(fcreacion);
        panel.add(estado);

        panel.add(btGuardar);
        panel.add(btActualizar);
        panel.add(btLimpiar);

        this.getContentPane().add(panel);
    }

    public void cargarEventos(){
        btGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListarFlores lf = new ListarFlores();
                lf.setVisible(true);
                lf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                lf.setTitle("Flores existentes");

            }
        });
    }
    /**/
}
