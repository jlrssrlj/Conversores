package Controlador;

import Modelo.UnidadMedidas;
import Vista.VistaUnidaddemedida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ControladorUnidadmedida implements ActionListener {
    private VistaUnidaddemedida vm;
    private UnidadMedidas medidas;

    public ControladorUnidadmedida(VistaUnidaddemedida vm){
        this.vm=vm;
        this.medidas= new UnidadMedidas(vm);
        this.vm.convertirM.addActionListener(this);

    }
    public ControladorUnidadmedida(){
        this.vm.convertirM.addActionListener(this);
    }
    public void inciarm(){
        vm.setBounds(0, 0, 310, 200);
        vm.setTitle("Conversor de medidas");
        vm.getContentPane().setBackground(Color.gray);
        vm.setLayout(null);

        // Cargar la imagen desde un archivo (asegúrate de que la ruta del archivo sea correcta)
        //ImageIcon imageIcon = new ImageIcon("C:\\Users\\ramos\\Downloads\\moneda.JPG");

        // Obtener el ancho y alto de la ventana
        int ventanaAncho = vm.getWidth();
        int ventanaAlto = vm.getHeight();

        // Crear un JLabel para mostrar la imagen
        /*JLabel imagenLabel = new JLabel(imageIcon);
        imagenLabel.setBounds(-10, -12, ventanaAncho, ventanaAlto);
        vm.add(imagenLabel);*/

        vm.setVisible(true);
        vm.setLocationRelativeTo(null);
        vm.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vm.convertirM) {
            try {
                this.medidas.setCambio(Double.parseDouble(this.vm.cantidadM.getText()));
                double resultado = this.medidas.conversor();
                DecimalFormat df = new DecimalFormat("#.###########");
                this.vm.resultadoM.setText(df.format(resultado));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(vm, "Por favor, ingrese un número válido", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

        }
    }
}
