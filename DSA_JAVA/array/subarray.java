package array;

public class subarray {
    public static void main(String[] args) {

        int[] arr = {11,22,33,44,55,66,77,88};

        for (int st = 0; st < arr.length; st++) {

            for (int en = st; en < arr.length; en++) {

                for (int k = st; k <= en; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }
}