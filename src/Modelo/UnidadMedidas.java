package Modelo;

import Vista.VistaUnidaddemedida;

public class UnidadMedidas extends Convertir implements  Conversor{

    private VistaUnidaddemedida vm;

    private double[][] unidaddemedida ={
            {1,0.1,0.001,0.000001},//mm
            {10,1,0.01,0.001},//cm
            {1000,100,1,0.001},//m
            {1000000,100000,1000,1}//km
    };
    public UnidadMedidas(VistaUnidaddemedida vm){
        this.vm=vm;
    }

    @Override
    public double conversor() {
        String monedaOrigen = this.vm.Entrada.getSelectedItem().toString();
        String monedaDestino = this.vm.Salida.getSelectedItem().toString();

        int filaOrigen = obtenerIndice(monedaOrigen);
        int columnaDestino = obtenerIndice(monedaDestino);

        double tasaConversion = unidaddemedida[filaOrigen][columnaDestino];
        resultado = cambio * tasaConversion;

        return resultado;

    }

    @Override
    public int obtenerIndice(String valor) {
        switch (valor) {
            case "MILIMETROS":
                return 0;
            case "CENTIMETROS":
                return 1;
            case "METROS":
                return 2;
            case "KILOMETROS":
                return 3;

            default:
                return -1; // Moneda no encontrada

        }
    }
}
