package Application;

public class AreaCircTest {
    public static void main(String[] args) {

        AreaCirc A1 = new AreaCirc(10);
       // A1.pi = 10;
        System.out.println(A1.area());

        AreaCirc A2 = new AreaCirc(100);
       // A2.pi = 10;
        System.out.println(A2.area());

        System.out.println(AreaCirc.area(100));
    }
}


