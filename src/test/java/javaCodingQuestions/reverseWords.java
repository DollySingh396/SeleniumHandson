package javaCodingQuestions;

import java.util.Arrays;

public class reverseWords {



    public static void main(String[] args){


        String str = "apple banana kiwi";

        String[] arr = str.split(" ");


        for(int i = 0; i < arr.length; i++){
            System.out.println("after split array is "+ arr[i]+ "\n");
        }

        System.out.println("after split array is "+ Arrays.toString(arr));

        int j = arr.length;
        int i = 0;

        while( i <= j){

            String temp = arr[i];
            System.out.println("temp value is "+temp);
            arr[i] = arr[j - 1];
            arr[j - 1] = temp;
            i++;
            j--;

        }

        System.out.println("after swap array is "+ Arrays.toString(arr));

        StringBuilder res = new StringBuilder();
        for(int k = 0; k < arr.length; k++){
            res.append(arr[k]);
            res.append(" ");
        }

        System.out.println("final res is " +res.toString().trim());


    }
}
