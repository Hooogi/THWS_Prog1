package mathe;

public class quicksort {
    public static int[] quicksort_rek(int[] array, int low, int high){
        int i = low;
        int j = high;

        int pivot = array[low+(high-low)/2];

        while(i<=j){
            while(array[i]<pivot){
                i++;
            }
            while(array[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp = array[i];
                array[i] = array[j];
                array[j]= temp;
                i++;
                j--;
            }
            if(low<j){
                quicksort_rek(array, low,j);
            }
            if(i<high){
                quicksort_rek(array, i, high);
            }
        }
        return array;
    }
}
