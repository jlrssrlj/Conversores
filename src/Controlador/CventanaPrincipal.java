package Controlador;


import Vista.VentaPrincipal;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VistaUnidaddemedida;
import Vista.VistaMonedas;

public class CventanaPrincipal implements ActionListener {
    VentaPrincipal view = new VentaPrincipal();

    public CventanaPrincipal(){
        this.view.Monedas.addActionListener(this);
        this.view.Medidas.addActionListener(this);

    }
    public void iniciar(){
        view.setBounds(0,0,350,250);
        view.setTitle("Conversor de monedas");
        view.getContentPane().setBackground(Color.GREEN);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setResizable(false);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.view.Monedas){
            VistaMonedas vis = new VistaMonedas();
            Controlador con = new Controlador(vis);
            con.iniciar();
        }
        if(e.getSource()== this.view.Medidas){
            VistaUnidaddemedida vm = new VistaUnidaddemedida();
            ControladorUnidadmedida um = new ControladorUnidadmedida(vm);
            um.inciarm();
        }

    }
}
