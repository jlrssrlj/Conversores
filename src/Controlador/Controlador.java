package Controlador;

import Modelo.Moneda;
import Vista.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Controlador implements ActionListener {
    private vista vis;
    private Moneda moneda;

    public Controlador(vista vis) {
        this.vis = vis;
        this.moneda = new Moneda(vis);
        this.vis.convertir.addActionListener(this);
    }


    public Controlador() {


        this.vis.convertir.addActionListener(this);
    }

    public void iniciar() {
        vis.setBounds(0, 0, 310, 200);
        vis.setTitle("Conversor de monedas");
        vis.getContentPane().setBackground(Color.gray);
        vis.setLayout(null);

        // Cargar la imagen desde un archivo (asegúrate de que la ruta del archivo sea correcta)
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\ramos\\Downloads\\moneda.JPG");

        // Obtener el ancho y alto de la ventana
        int ventanaAncho = vis.getWidth();
        int ventanaAlto = vis.getHeight();

        // Crear un JLabel para mostrar la imagen
        JLabel imagenLabel = new JLabel(imageIcon);
        imagenLabel.setBounds(-10, -12, ventanaAncho, ventanaAlto);
        vis.add(imagenLabel);

        vis.setVisible(true);
        vis.setLocationRelativeTo(null);
        vis.setResizable(false);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vis.convertir) {
            try {
                this.moneda.setCambio(Double.parseDouble(this.vis.cantidad.getText()));
                double resultado = this.moneda.conversor();
                DecimalFormat df = new DecimalFormat("#.####");
                this.vis.resultado.setText(df.format(resultado));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(vis, "Por favor, ingrese un número válido", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

        }
    }
}
