package array;

public class oddevenonarray {

    public static void main(String[] args) {

        int[] arr = {5, 5,6, 1, 3};

        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}