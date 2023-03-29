package Ventanas;

import Clases.CFlor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class ListarFlores extends JFrame {
    private JPanel panel;
    private JTable tablaFlores;
    private DefaultTableModel modeloTablaFlores;
    private JScrollPane despl;
    private JButton jbtnCerrar;
    public ListarFlores(){
        setSize(500, 550);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        inicializarComponentes();
        cargarEventos();
    }
    /**/
    private void inicializarComponentes(){
        panel = new JPanel();
        panel.setLayout(null);

        modeloTablaFlores = new DefaultTableModel();

        modeloTablaFlores.addColumn("id");
        modeloTablaFlores.addColumn("Nombre");
        modeloTablaFlores.addColumn("Aroma");
        modeloTablaFlores.addColumn("Color");
        modeloTablaFlores.addColumn("Precio");
        modeloTablaFlores.addColumn("Stock");
        modeloTablaFlores.addColumn("F. Creacion");
        modeloTablaFlores.addColumn("Estado");

        tablaFlores = new JTable(modeloTablaFlores);

        tablaFlores.setBounds(30, 50, 430, 350);
        panel.add(tablaFlores);

        despl = new JScrollPane(tablaFlores,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        despl.setBounds(30, 50, 430, 350);
        despl.setAutoscrolls(true);
        panel.add(despl);

        jbtnCerrar = new JButton("Cerrar");
        jbtnCerrar.setBounds(30,450, 120, 35);

        panel.add(jbtnCerrar);

        this.getContentPane().add(panel);

        final List<List<String>> datos = CFlor.mostrarFlores("");
        for (List<String> list : datos) {
            modeloTablaFlores.addRow(list.toArray());
        }
    }
    private void cargarEventos(){
        jbtnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CFlor f = new CFlor();
                crudFlor cf = new crudFlor(f);
                cf.setTitle("CRUD FLOR");
                cf.setVisible(true);
                dispose();
            }
        });

        tablaFlores.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                int filaClick = tablaFlores.rowAtPoint(e.getPoint());
                String fe = tablaFlores.getValueAt(filaClick,6).toString();

                SimpleDateFormat sdtf = new SimpleDateFormat("yyyy-M-d hh:mm:ss");
                Date fechita = null;
                try {
                    fechita = sdtf.parse(fe);
                }catch(Exception ex){
                    System.out.println("Error: Formato de fecha inválido");
                }

                CFlor f = new CFlor(
                        tablaFlores.getValueAt(filaClick,1).toString(),
                        tablaFlores.getValueAt(filaClick,2).toString(),
                        tablaFlores.getValueAt(filaClick,3).toString(),
                        Double.parseDouble(tablaFlores.getValueAt(filaClick,4).toString()),
                        Integer.parseInt(tablaFlores.getValueAt(filaClick,5).toString()),
                        fechita,
                        tablaFlores.getValueAt(filaClick,7).toString()
                );
                f.setIdflor(Integer.parseInt(tablaFlores.getValueAt(filaClick,0).toString()));
                crudFlor cf = new crudFlor(f);
                cf.setVisible(true);
                cf.setTitle("CRUD FLOR");
                dispose();
            }
        });

    }
}
