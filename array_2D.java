import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        int ar[][] = new int[2][2];
        int row = 2, column = 2;

        System.out.println("Enter array: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
