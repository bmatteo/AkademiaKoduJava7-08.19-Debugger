public class Walec {
    private int r;
    private int h;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double calculateFieldOfCylinder() {
        double a = 2*Math.PI*this.getR();
        double b = this.getH() + this.getR();
        double result = a*b;

        return result;
    }
}
