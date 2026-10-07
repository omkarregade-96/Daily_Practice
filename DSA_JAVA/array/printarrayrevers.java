package array;

public class printarrayrevers {
    public static void main(String[] args) {

        int[] arr = { 10,20,30,40,50,60,70,80,90,100};
        int front =0;
        int back = arr.length-1;
        while(front<back){
            int temp = arr[front];
            arr[front]=arr[back];
            arr[back]=temp;
            front++;
            back--;

        }
        for(int k=0; k< arr.length;k++){
            System.out.print(arr[k] + "  ");
        }







    }
    }
