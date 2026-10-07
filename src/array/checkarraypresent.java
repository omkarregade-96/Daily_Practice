package array;

public class checkarraypresent {

    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 45, 50};
        int target=30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
            }

        if(found){
            System.out.println("found");
        }else {
            System.out.println("not found");


        }}}














