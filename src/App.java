public class App {
    public static void main(String[] args) throws Exception {

        Punto p1 = new Punto(2, 5);
        Punto3D pD1 = new Punto3D(1, 2, 2, 2);
        PuntoTiempo pt1 = new PuntoTiempo();

        double mod = p1.modulo();
        double modpt = pt1.modulo();
        double vel = pt1.velocidad();
        double p3D = pD1.modulo();

        System.out.println("x= " + p1.getX() + "    " + "y= " + p1.getY());
        System.out.println("Modulo del p1: " + mod);
        System.out.println("x= " + pt1.getX() + "    " + "y= " + pt1.getY() + "   " + "t: " + pt1.getT());
        System.out.println("Modulo del pt1: " + modpt);
        System.out.println("velocidad del punto tiempo 1: " + vel);
        System.out.println("x= " + pD1.getX() + "    " + "y= " + pD1.getY() + "    " + "y= " + pD1.getZ() + "    " + "y= " + pD1.getT());
        System.out.println("Modulo del pD1: " + p3D);
    }
}