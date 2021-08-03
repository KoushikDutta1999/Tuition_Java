import java.util.*;

class addtwo {
    public static void main(String[] args) {
        int k = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        n = sc.nextInt();
        sc.close();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = k;
            k = k + 2;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
