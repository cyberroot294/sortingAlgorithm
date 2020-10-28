package sortingAlgorithm;
import java.util.Arrays;

/**
 * selectionSorting
 */
public class countingSort {


    public static void main(String[] args) {
    
        
        int[] ar = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        int maks = 0;
        for(int i : ar){
            if (i > maks) {
                maks = i;
            }
        }
        int[] arr = new int[maks+1];
        for(int i = 0; i < ar.length; i++)
        arr[ar[i]]++;
        
        // System.out.println(maks);
        int maxCount = 0;
        int maxPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(maxCount < arr[i]){
                maxCount = arr[i];
                maxPos = i;
            }
        }
        System.out.println(maxPos);
        System.out.println(Arrays.toString(arr));
    }
}