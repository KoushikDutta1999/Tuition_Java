import java.util.*;

class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits: ");
        int n = sc.nextInt();
        sc.close();
        int a = n;
        int reverse = 0;

        while (n != 0) {

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println(reverse + " is the reversed number of " + a);
    }
}
