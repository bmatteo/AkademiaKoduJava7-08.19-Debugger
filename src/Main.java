public class Main {
    public static void main(String[] args) {

        Walec w = new Walec();
        w.setH(5);
        w.setR(10);

        double a = 2*Math.PI*w.getR();
        double b = w.getH() + w.getR();
        double poleWalca = a*b;
        double objWalca = Math.PI*w.getR()*w.getR()*w.getH();

        System.out.println(poleWalca);
        System.out.println(objWalca);

        Example.a();
    }
}
