package Modelo;

import Vista.vista;

public class Moneda extends Convertir implements Conversor {
    private vista vis;

    private double[][] tasasConversion = {
            {1.0, 0.000245, 0.0041, 29.53,29.47},//colombia
            {4195.18, 1, 16.75, 264.57,0.0072},//usd
            {244.72 , 0.060, 1.0, 15.80,8.28},//mexico
            {15.45 , 0.0038,1.0,0.063 , 0.52},//argentina
            {29.47,0.0072,0.12,1.91,1}//yan
    };

    public Moneda(vista vis) {
        this.vis = vis;
    }

    @Override
    public double conversor() {
        String monedaOrigen = this.vis.divisas1.getSelectedItem().toString();
        String monedaDestino = this.vis.divisas2.getSelectedItem().toString();

        int filaOrigen = obtenerIndice(monedaOrigen);
        int columnaDestino = obtenerIndice(monedaDestino);

        double tasaConversion = tasasConversion[filaOrigen][columnaDestino];
        resultado = cambio * tasaConversion;

        return resultado;
    }

    @Override
    public int obtenerIndice(String moneda) {
        switch (moneda) {
            case "COP":
                return 0;
            case "USD":
                return 1;
            case "MEX":
                return 2;
            case "P.ARG":
                return 3;
            case "YEN":
                return 4;
            default:
                return -1; // Moneda no encontrada
        }
    }





}


