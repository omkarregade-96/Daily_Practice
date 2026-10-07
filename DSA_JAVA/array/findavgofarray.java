package array;

public class findavgofarray {


    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50};
        double avg =0;
        int sum=0;

        for(int i=0; i< arr.length; i++){
           sum = sum+arr[i];
        }


       avg = (double) sum/arr.length;


        System.out.println(avg);


    }

}
