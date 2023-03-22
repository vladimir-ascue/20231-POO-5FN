package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal extends JFrame {
    private JPanel panel;
    private JLabel jlbTitulo;
    private JButton jbtnFlores;
    private JButton jbtnClientes;
    private JButton jbtnVendedores;

    public principal(){
        setSize(900, 500); // Dimesiones en pixeles
        setDefaultCloseOperation(EXIT_ON_CLOSE); //(para cerrar el programa)
        setResizable(false); // No se podra redimensional (true para que si se pueda)
        setLocationRelativeTo(null); // Centramos la ventana

        inicializarComponentes(); //
        cargarEventos(); //
    }

    public void inicializarComponentes() {
        panel = new JPanel();
        panel.setLayout(null);

        jlbTitulo = new JLabel();
        jlbTitulo.setText("CRUD GUI");
        jlbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        jlbTitulo.setBounds(0, 0, 80, 40); // (posX, posY, ancho, alto)

        jbtnFlores = new JButton();
        jbtnFlores.setText("Gest. Flores");
        jbtnFlores.setBounds(50, 45, 70, 45);

        jbtnClientes = new JButton();
        jbtnClientes.setText("Gest. Flores");
        jbtnClientes.setBounds(150, 45, 70, 45);

        jbtnVendedores = new JButton();
        jbtnVendedores.setText("Gest. Flores");
        jbtnVendedores.setBounds(240, 45, 70, 45);


        panel.add(jlbTitulo);
        panel.add(jbtnFlores);
        panel.add(jbtnClientes);
        panel.add(jbtnVendedores);

        this.getContentPane().add(panel);
    }

    public void cargarEventos(){
        jbtnFlores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crudFlor cf = new crudFlor();
                cf.setVisible(true);
                cf.setTitle("CRUD FLOR");
            }
        });

        jbtnClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crudCliente cc = new crudCliente();
                cc.setVisible(true);
                cc.setTitle("CRUD CLIENTE");
            }
        });

        jbtnVendedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crudVendedor cv = new crudVendedor();
                cv.setVisible(true);
                cv.setTitle("CRUD VENDEDORES");
            }
        });
    }
}
