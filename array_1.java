import java.util.*;
//import java.io.*;

class array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to print: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        a[0] = 1;
        int x = 2;

        // int y = x;
        for (int i = 1; i < n; i++) {
            a[i] = (int) Math.pow(x, 2) + 1;
            x = x + 1;
        }
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
        sc.close();
    }
}