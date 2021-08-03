import java.util.*;

class till_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to print to: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}