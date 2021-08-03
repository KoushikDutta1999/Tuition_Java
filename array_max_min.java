// import java.util.*;
// import java.lang.*;
// import java.io.*;

class array_max_min {
    public static void main(String[] args) {

        int a[] = { 9, 29, 49, 69, 89 };
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }

        }
        System.out.println("The maximum element in this array is " + max);
        System.out.println("The minimum element in this array is " + min);
    }

}