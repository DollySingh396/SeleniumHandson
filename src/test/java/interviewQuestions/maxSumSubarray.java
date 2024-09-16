package interviewQuestions;

import java.util.Arrays;

public class maxSumSubarray {


    public static void main(String[] args) {
        int[] array = {2, 3, -4, 7, -15, -2, 20};
        int startIndex = 0;
        int lastIndex = 0;
        int sum = 0;
        int maxSum = 0;
        int[] res = new int[2];


        for (int i = 0; i < array.length; i++) {

             sum = array[i];
             maxSum = sum;
             startIndex = i;

            if (!(i < array.length) ) {
                lastIndex = i + 1;
            }


            while (!(sum <= 0)) {

                if (!(i < array.length)) {
                    sum += array[lastIndex];
                }

                if (maxSum < sum) {
                    maxSum = sum;
                    res[0] = startIndex;
                    res[1] = lastIndex;
                }

                lastIndex++;

            }

        }

        System.out.println("max sum is " + maxSum + "result arrays " + Arrays.toString(res));

    }
}
