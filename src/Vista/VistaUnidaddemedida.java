package Vista;

import javax.swing.*;
import java.awt.*;

public class VistaUnidaddemedida extends JFrame {

    public JComboBox Entrada, Salida;
    public JTextField cantidadM, resultadoM;

    public JButton convertirM;

    public VistaUnidaddemedida(){
        setLayout(null);
        Entrada = new JComboBox();
        Entrada.setBounds(150,30,100,30);
        add(Entrada);


        Entrada.addItem("MILIMETROS");
        Entrada.addItem("CENTIMETROS");
        Entrada.addItem("METROS");
        Entrada.addItem("KILOMETROS");



        Salida = new JComboBox();
        Salida.setBounds(150,60,100,30);
        add(Salida);


        Salida.addItem("MILIMETROS");
        Salida.addItem("CENTIMETROS");
        Salida.addItem("METROS");
        Salida.addItem("KILOMETROS");

        cantidadM = new JTextField();
        cantidadM.setBounds(10,30,100,30);
        add(cantidadM);

        resultadoM = new JTextField();
        resultadoM.setBounds(10,60,100,30);
        add(resultadoM);

        convertirM = new JButton("Convertir");
        convertirM.setBounds(50, 120, 100, 30);
        convertirM.setFont(new Font("Arial", Font.PLAIN, 16));
        add(convertirM);


    }
}
