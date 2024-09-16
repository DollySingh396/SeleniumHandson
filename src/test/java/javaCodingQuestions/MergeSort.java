package javaCodingQuestions;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {

        int[] array = { 1,5,7,8,2,4,6,9};
        int l = 0;
        int r = array.length -1;

        mergeSort(array, l, r);
        System.out.println(" sorted array is "+ Arrays.toString(array));
    }


    public static void mergeSort( int[] array, int l, int r){
        if( l < r){
            int m = (l+r)/2;
            mergeSort(array, l, m);
            mergeSort(array, m+1, r);
            merge(array, l, m, r);
        }
    }


    public static void merge( int[] array, int l, int m, int r){

        int n1 = m-l+1;
        int n2 = r-m;


        int[] arrayLeft = new int[n1];
        int[] arrayRight = new int[n2];

        for(int i = 0; i < arrayLeft.length; i++){
            arrayLeft[i] = array[l + i];
        }

        for( int j = 0; j < arrayRight.length; j++){
            arrayRight[j] = array[m+1+j];
        }


        int i = 0,j =0;
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (arrayLeft[i] <= arrayRight[j]) {
                array[k] = arrayLeft[i];
                i++;
            }
            else {
                array[k] = arrayRight[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            array[k] = arrayLeft[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            array[k] = arrayRight[j];
            j++;
            k++;
        }

    }

}
