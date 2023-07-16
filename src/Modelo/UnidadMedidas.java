package Modelo;

public class UnidadMedidas extends Convertir implements  Conversor{
    protected double cm;
    protected double m;
    protected  double mm;

    @Override
    public double conversor() {
        return 0;
    }

    @Override
    public int obtenerIndice(String moneda) {
        return 0;
    }
}
