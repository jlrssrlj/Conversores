package Modelo;

import Vista.vista;

public class Dolar extends Convertir implements Conversor {
    protected double dolar= 4195.18;//este valor es para dolar a cop
    protected double adolar= 0.0039;//para argentino a dolar
    protected double mexicano= 244.72;//sirve para cop a mex
    protected double amexicano= 0.066;
    protected double dmexicano= 17.15;
    protected double ymexicano= 0.12;
    protected double yen= 29.53;
    protected double dyen= 142.23;
    protected double myen= 8.30;
    protected double ayen= 0.55;
    protected double yena= 1.82;
    protected double argentino= 16.23;
    protected double dargentino= 258.65;
    protected double margentino= 15.11;


    private vista vis;

    public Dolar(vista vis) {
        this.vis = vis;
    }





    @Override
    public double conversor() {
        String monedaOrigen = this.vis.divisas1.getSelectedItem().toString();
        String monedaDestino = this.vis.divisas2.getSelectedItem().toString();


        if (monedaOrigen.equals("COP")) {//ok
            if (monedaDestino.equals("USD")) {
                this.resultado = this.cambio / this.dolar;
            } else if (monedaDestino.equals("MEX")) {
                this.resultado = this.cambio / this.mexicano;
            } else if (monedaDestino.equals("P.ARG")) {
                this.resultado = this.cambio * this.argentino;
            } else if (monedaDestino.equals("YEN")) {
                this.resultado = this.cambio * this.yen;
            }
        } else if (monedaOrigen.equals("USD")) {//ok
            if (monedaDestino.equals("COP")) {
                this.resultado = this.cambio * this.dolar;
            } else if (monedaDestino.equals("MEX")) {
                this.resultado = this.cambio * this.dmexicano;
            } else if (monedaDestino.equals("P.ARG")) {
                this.resultado = this.cambio * this.dargentino;
            } else if (monedaDestino.equals("YEN")) {
                this.resultado = this.cambio * this.dyen;
            }
        } else if (monedaOrigen.equals("MEX")) {//ok
            if (monedaDestino.equals("COP")) {
                this.resultado = this.cambio / this.dolar;
            } else if (monedaDestino.equals("USD")) {
                this.resultado = this.cambio / this.dmexicano;
            } else if (monedaDestino.equals("P.ARG")) {
                this.resultado = this.cambio * this.margentino;
            } else if (monedaDestino.equals("YEN")) {
                this.resultado = this.cambio * this.myen;
            }
        } else if (monedaOrigen.equals("P.ARG")) {
            if (monedaDestino.equals("COP")) {
                this.resultado = this.cambio * this.argentino;
            } else if (monedaDestino.equals("MEX")) {
                this.resultado = this.cambio * this.amexicano;
            } else if (monedaDestino.equals("USD")) {
                this.resultado = this.cambio * this.adolar;
            } else if (monedaDestino.equals("YEN")) {
                this.resultado = this.cambio * this.ayen;
            }
        }
        else if (monedaOrigen.equals("YEN")) {
            if (monedaDestino.equals("COP")) {
                this.resultado = this.cambio * this.yen;
            } else if (monedaDestino.equals("MEX")) {
                this.resultado = this.cambio * this.ymexicano;
            } else if (monedaDestino.equals("USD")) {
                this.resultado = this.cambio * this.adolar;
            } else if (monedaDestino.equals("P.ARG")) {
                this.resultado = this.cambio * this.yena;
            }
        }

        return this.resultado;
    }
}
