import java.util.*;
import java.lang.Math;

class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        sc.close();
        int b = a;
        int len = 0, temp = a;
        while (temp > 0) {
            len++;
            temp /= 10;
        }

        int x = 0;
        while (a > 0) {
            int rem = a % 10;
            a /= 10;
            x = x + (int) Math.pow(rem, len);
        }
        if (x == b)
            System.out.println(b + " is an Armstrong number.");
        else
            System.out.println(b + " is not an Armstrong number.");
    }
}
