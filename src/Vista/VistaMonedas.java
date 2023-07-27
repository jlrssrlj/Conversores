package Vista;

import javax.swing.*;
import java.awt.*;


public class VistaMonedas extends JFrame  {

    public JComboBox divisas1, divisas2;
    public JTextField cantidad, resultado;

    public JButton convertir;

    public VistaMonedas(){
        setLayout(null);
        divisas1 = new JComboBox();
        divisas1.setBounds(150,30,100,30);
        add(divisas1);


        divisas1.addItem("USD");
        divisas1.addItem("COP");
        divisas1.addItem("MEX");
        divisas1.addItem("P.ARG");
        divisas1.addItem("YEN");


        divisas2 = new JComboBox();
        divisas2.setBounds(150,60,100,30);
        add(divisas2);


        divisas2.addItem("USD");
        divisas2.addItem("COP");
        divisas2.addItem("MEX");
        divisas2.addItem("P.ARG");
        divisas2.addItem("YEN");

        cantidad = new JTextField();
        cantidad.setBounds(10,30,100,30);
        add(cantidad);

        resultado = new JTextField();
        resultado.setBounds(10,60,100,30);
        add(resultado);

        convertir = new JButton("Convertir");
        convertir.setBounds(50, 120, 100, 30);
        convertir.setFont(new Font("Arial", Font.PLAIN, 16));
        add(convertir);


    }




}
