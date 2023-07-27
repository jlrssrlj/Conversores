package Vista;

import javax.swing.*;

public class VentaPrincipal extends JFrame{
    public JButton Monedas,Medidas,Temperatura;
    public JLabel Texto;

    public VentaPrincipal(){

        setLayout(null);
        Texto = new JLabel("Conversores");
        Texto.setBounds(70,5,150,30);
        add(Texto);

        //Botones
        Monedas = new JButton("Monedas");
        Monedas.setBounds(50,60,150,30);
        add(Monedas);

        Medidas = new JButton("Unidad de medida");
        Medidas.setBounds(50,120,150,30);
        add(Medidas);



    }
}
