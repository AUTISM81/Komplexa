public class Komplex {
    private  double real;
    private double img;

    public Komplex(double img, double real) {
        this.real = real;
        this.img = img;
    }

    public double getImg() {
        return img;
    }

    public double getReal() {
        return real;
    }

    public Komplex add(Komplex b) {
        double real = this.getReal() + b.getReal();
        double img = this.getImg() + b.getImg();

        return new Komplex(img, real);
    }

    @Override
    public String toString() {
        return "Komplex = " + real + " + " + " " + img + 'i';
    }
}
