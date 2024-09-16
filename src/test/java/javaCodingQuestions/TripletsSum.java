package javaCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class TripletsSum {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 4, 5, 6};
        int sum = 5;


        for( int i = 0; i < arr.length; i++){

            Map<Integer, Integer> map = new HashMap<>();
            int target = sum - arr[i]; // 5 = 0 = 5

            for(int j = i+1; j < arr.length; j++){
                int  val = target - arr[j]; // 5 - 1 = 4

                if(map.containsKey(val)){
                    System.out.println(" Triplet sum values are "+arr[i]+" "+arr[j]+" "+val);
                    break;
                }
                else{
                    map.put(arr[j], j);
                }
            }

        }



    }

}

