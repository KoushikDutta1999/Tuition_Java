import java.util.Scanner;

public class piramid {
    public static void main(String[] args) {
        System.out.println("enter the number you want to print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                // for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
                // System.out.print("*");
            }
            System.out.println();
        }
    }
}
