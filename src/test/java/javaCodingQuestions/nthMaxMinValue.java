package javaCodingQuestions;

import java.util.Arrays;

public class nthMaxMinValue {


    public static void main(String[] args) {

        int[] array = {4, 781, 8, 99, 103, 2, 1};
        // 1 2 4 8 99 103 781
        int n = 2;
        int length = array.length - 1;

        // find n max & n min value from array

        Arrays.sort(array);// use merge sort instead

        int nMax = array[length - n + 1];
        int nMin = array[n - 1];
        System.out.println(n + " th Max value is " + nMax);
        System.out.println(n + " th Min value is " + nMin);


    }

}
