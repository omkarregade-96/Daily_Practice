package array;

public class maxfindarray {

    public static void main(String[] args) {


    int[] arr = { 1,2,3,4,5,8,6,77};
    int find =0;
    int mind=0;
    for(int i =1;i<arr.length;i++){
        if(arr[i] > find){
            find=arr[i];



        }
    }


        System.out.println(find);
        System.out.println(mind);


}

}