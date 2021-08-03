import java.util.*;

class missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int temp = sc.nextInt();
            sum += temp;
            sc.close();
        }
        int s = n * (n + 1) / 2;
        System.out.println(s - sum);

    }
}
