package javaCodingQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class allPairsOfTargetSum {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 2, 5, -1};
        int sum = 4;
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < array.length; i++) {
            int val = sum - array[i];

            if (map.containsKey(val)) {
                res[0] = val;
                res[1] = array[i];
                System.out.println(" values are " + Arrays.toString(res));
//                System.out.println(" Pair having sum as "+sum+" is "+array[i]+" and "+val);
//                System.out.println("Index values having sum as "+sum+" are "+i+" and "+map.get(val));
            }
            map.put(array[i], i);


        }

    }

}
