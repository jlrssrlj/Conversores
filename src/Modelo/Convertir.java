package Modelo;

public abstract class Convertir {

    protected double cambio;
    protected double resultado;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }



    public abstract int obtenerIndice(String valor);
}
