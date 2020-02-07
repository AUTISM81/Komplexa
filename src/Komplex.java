public class Komplex {
    private  double real;
    private double img;

    public Komplex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    public Komplex add(Komplex b) {
        double real = this.getReal() + b.getReal();
        double img = this.getImg() + b.getImg();

        return new Komplex(real, img);
    }

    public Komplex multiply(Komplex b) {
        double real = (this.getReal()*b.getReal()) - (this.getImg()*b.getImg());
        double img = (this.getImg()*b.getReal()) + (this.getReal()*b.getImg());

        return new Komplex(real, img);
    }

    public double arg() {
        double arctan = 0;
        if (this.getReal() > 0){
            arctan = this.getImg()/this.getReal();
        } else if (this.getImg() >= 0 || this.getReal() < 0){
            arctan = (this.getImg()/this.getReal()) + Math.PI;
        } else if (this.getImg() < 0 || this.getReal() < 0){
            arctan = (this.getImg()/this.getReal()) - Math.PI;
        } else if (this.getImg() > 0 || this.getReal() == 0){
            arctan = Math.PI/2;
        } else if (this.getImg() < 0 || this.getReal() == 0){
            arctan = (Math.PI/2)*-1;
        } else {
            System.out.print("Undefined");
        }

        return arctan;
    }

    @Override
    public String toString() {
        return "Komplex = " + real + " + " + " " + img + 'i';
    }
}
