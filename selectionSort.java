// import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * new
 */
public class selectionSort {

    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3,4,2,9,4,5,6};

        
        for(int i = 0; i < arr.length; i++){
            int idMin = i;
            int min = arr[i];

            for (int j = i+1; j < arr.length; j++) {
                if (min > arr[j]) {
                    idMin = j;
                    min = arr[j];
                }
            }

            // swapping
            // int temp = 0;
            int temp = arr[i];
            arr[i] = min;
            arr[idMin] = temp; 

        }

        System.out.println(Arrays.toString(arr));
    }
}