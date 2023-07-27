import Controlador.CventanaPrincipal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*vista vis = new vista();
        Controlador con = new Controlador(vis);
        con.iniciar();
        VistaUnidaddemedida vm = new VistaUnidaddemedida();
        ControladorUnidadmedida um = new ControladorUnidadmedida(vm);
        um.inciarm();*/
        CventanaPrincipal principal = new CventanaPrincipal();
        principal.iniciar();
    }
}