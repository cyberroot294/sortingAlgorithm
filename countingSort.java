import java.util.Arrays;

/**
 * selectionSorting
 */
public class countingSort {

    // static final int NUM_TYPES = 5;

    public static void main(String[] args) {
    
        // int[] birds = {1,2,1,3,2};
        // Get counts of each type
        // int[] count = new int[NUM_TYPES + 1];
        // for (int num : birds) {
        //     count[num]++;
        // }

        // System.out.println(Arrays.toString(count));
        
        // Find max 
        // int maxIndex = 1;
        // for (int i = 0; i < count.length; i++) {
        //     if (count[i] > count[maxIndex]) {
        //         maxIndex = i;
        //     }
        // }
        // return maxIndex;
    
        // Complete this function
        // int n = 5;
        // int[] ar = {1,0,1,2,0};
        // int ary[] = new int[n];
        // for(int i = 0; i < n ; i++ )
        // ary[ar[i]]++; 
        // int max = 0,maxpos=0;
        // for(int i = 0 ; i < n ; i++)
        //     {
        //     if(ary[i] > max)
        //         {
        //         max = ary[i];
        //         maxpos = i;
        //     }
        // }
        // int[] ar = {1,2,7,1,2,2};
        // int[] ary = new int[8];
        // for(int i = 0; i < ar.length; i++) 
        // ary[ar[i]]++;
        // System.out.println(Arrays.toString(ary));
        
        // Integer[] ar = new Integer[list.size()];
        // ar = list.toArray(ar);
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