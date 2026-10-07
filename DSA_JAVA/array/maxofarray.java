package array;

import java.util.Scanner;

public class maxofarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();       // array size
        int[] arr = new int[max];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max1 = arr[0];

        for (int i = 1; i < max; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];       // FIX
            }
        }

        System.out.println("Maximum element = " + max1);

        sc.close();
    }
}