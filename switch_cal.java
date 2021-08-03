import java.util.*;

class switch_cal {
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
                System.out.println("Addition " + c);
                break;
            case '-':
                c = a - b;
                System.out.println("Substraction " + c);
                break;
            case '*':
                c = a * b;
                System.out.println("Multiplication " + c);
                break;
            case '/':
                c = a / b;
                System.out.println("Division " + c);
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
