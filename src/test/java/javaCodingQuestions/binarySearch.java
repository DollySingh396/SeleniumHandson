package javaCodingQuestions;

import java.util.Arrays;

public class binarySearch {

    public static void main(String[] args) {

        int[] array = { 1,5,7,8,2,4,6,9};
        Arrays.sort(array);

        System.out.println("sorted array is "+Arrays.toString(array));
        int key = 8;
        int l = 0;
        int r = array.length-1;
        binarySearch(array, l, r, key);


    }

    public static void binarySearch(int[] array, int l, int r, int key){

        boolean flag = false;
        while( l <= r ){
            int m = (l+r)/2;
            if( key < array[m]){
                r = m-1;
            }
            else if( key > array[m]){
                l = m+1;
            }
            else {
                System.out.println("Key is found at index "+m);
                flag = true;
                break;
            }
        }
        if( !flag){
            System.out.println("Key is not present in array ");

        }

    }


}
