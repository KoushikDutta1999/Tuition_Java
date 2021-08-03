import java.util.*;

class array_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        sc.close();
        int a[] = new int[n];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < n; ++i) {
            a[i] = a[i - 1] + a[i - 2];
        }
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}