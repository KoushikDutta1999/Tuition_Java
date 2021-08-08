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
        try {
            if (a < 0 || b < 0) {
                throw new Exception("value must be positive");
            } else {
                switch (cal) {
                    case '+':
                        try {
                            if (a > 0 || b > 0) {
                                c = a + b;
                                System.out.println("Addition " + c);
                            } else {
                                throw new ArithmeticException("1st and 2nd number should be positive number");
                            }
                        } catch (Exception p) {
                            System.out.println(p);
                        }
                        break;
                    case '-':
                        try {
                            if (a < b) {
                                throw new ArithmeticException("2nd number should be greater than 1st number");
                            } else {
                                c = a - b;
                                System.out.println("Substraction " + c);
                            }
                        } catch (Exception q) {
                            System.out.println(q);
                        }
                        break;
                    case '*':
                        try {
                            if (a == 0 || b == 0) {
                                throw new ArithmeticException("Both number should be positive");
                            } else {
                                c = a * b;
                                System.out.println("Multiplication " + c);
                            }
                        } catch (Exception r) {
                            System.out.println(r);
                        }
                        break;
                    case '/':
                        try {
                            if (b == 0) {
                                throw new ArithmeticException("2nd number cannot be 0");
                            } else {
                                c = a / b;
                                System.out.println("division " + c);
                            }
                        } catch (Exception s) {
                            System.out.println(s);
                        }
                        break;
                    default:
                        System.out.println("Wrong input");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
