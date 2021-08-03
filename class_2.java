import java.util.*;

class calculator {
    double x, y;

    public void sum() {
        Double a = x + y;
        System.out.println(a);
    }

    public void sub() {
        Double b = x - y;
        System.out.println(b);
    }

    public void mul() {
        Double c = x * y;
        System.out.println(c);
    }

    public void div() {
        Double z = x / y;
        System.out.println(z);
    }

}

class class_2 {
    public static void main(String[] args) {
        calculator obj = new calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente two numbers: ");
        obj.x = sc.nextDouble();
        obj.y = sc.nextDouble();
        sc.close();
        obj.sum();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
