import java.util.*;

class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        Double a = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        Double b = sc.nextDouble();
        sc.close();
        Double sum = a + b;
        Double sub = a - b;
        Double mul = a * b;
        Double div = a / b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}