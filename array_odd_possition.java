import java.util.*;

class array_odd_possition {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to print among: ");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the numbers: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Odd Position elements:");
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                System.out.println(a[i]);
                sc.close();
            }
        }
    }
}