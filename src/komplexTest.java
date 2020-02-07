public class komplexTest {
    public static void main(String[] args) {
        Komplex a = new Komplex(3,2);
        Komplex b = new Komplex(4,1);


        //multiplikation
        Komplex c = a.multiply(b);
        System.out.print(c);


        //addition
        Komplex z = a.add(b);
        System.out.print(z);

    }
}
