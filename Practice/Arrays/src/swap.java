import java.lang.reflect.Array;
import java.util.Arrays;

public class swap {

    public static void main(String[] args) {
        int[] arr  = {1,5,7,8,9};

        swap_num(arr,1,2);
        System.out.println(Arrays.toString(arr));


    }

    static void swap_num(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];

        arr[index2] = temp;
    }

}

