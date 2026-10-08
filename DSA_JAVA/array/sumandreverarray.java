package array;

public class sumandreverarray {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99,111};
        int front =0;
        int back = arr.length-1;

        while (front<back){
            int temp = arr[front];
            arr[front]= arr[back];
            arr[back]=temp;
            front++;
            back--;

            

        }
        for(int k =0;k< arr.length;k++){
            System.out.print(arr[k]+ "   ");
        }











    }


}
