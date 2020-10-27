import java.util.Arrays;
public class insertionSort {
    public static void main(String[] args) {
        // int n = 6;
        int[] arr = {2, 4, 6, 8, 3, 1, 5, 7, 9, 3, 10, 2, 2, 3, 1};
        insertionSort1(arr);
    }

    // insertion sort ini tidak bekerja jika ada elemen yang sama
    static void insertionSort1(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            int n = arr.length;
            int min = arr[n-1];
            int indexMin = n-1;

            for(int i = n-2; i >= 0; i--){
                if(min > arr[i]){
                    min = arr[i];
                    indexMin = i;
                }else{
                    arr[indexMin] = arr[i];
                    indexMin = i;
                    arr[indexMin] = min;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
