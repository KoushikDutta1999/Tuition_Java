import java.util.*;

public class exception_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        float a = sc.nextFloat();
        System.out.print("Enter the 2nd number: ");
        float b = sc.nextFloat();
        System.out.print("Enter the switch( + , - , * , / ) : ");
        char cal = sc.next().charAt(0);
        float c;
        sc.close();
        switch (cal) {
            case '+':
                c = a + b;
                try {
                    if (a < 0 && b < 0)
                        throw new ArithmeticException("a and b should be positive number");
                } catch (Exception p) {
                    System.out.println(p);
                }
                System.out.println("Addition " + c);
                break;
            case '-':
                c = a - b;
                try {
                    if (b > a)
                        throw new ArithmeticException("b should be greater than a");
                } catch (Exception q) {
                    System.out.println(q);
                }
                System.out.println("Substraction " + c);
                break;
            case '*':
                c = a * b;
                try {
                    if (a == 0 && b == 0)
                        throw new ArithmeticException("A and B should be positive");
                } catch (Exception r) {
                    System.out.println(r);
                }
                System.out.println("Multiplication " + c);
                break;
            case '/':
                c = a / b;
                try {
                    if (b == 0)
                        throw new ArithmeticException("b cannot be 0");
                } catch (Exception s) {
                    System.out.println(s);
                }
                System.out.println("division " + c);
                break;
        }
    }
}
