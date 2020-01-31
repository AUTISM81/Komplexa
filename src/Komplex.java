public class Komplex {
    private double b;
    private double a;

    public Komplex(double img, double rea) {
        this.b = img;
        this.a = rea;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public void Addition() {
        Komplex z = new Komplex(a, b);
    }
}
