import java.util.Scanner;

public class pattern_blank {

    public static void main(String[] args) {

        System.out.println("enter the number you want to print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {

                // System.out.print("*");
                System.out.print(j % 2);
            }
            System.out.println();

        }
    }
}