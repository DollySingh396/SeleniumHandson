package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class openCloseApplications {

    public static void main(String[] args){
//
//        Open Netflix
//        Open chrome
//        Close Netflix
//        Open Terminal
//        Clear
//        Open zoom

        String[] arrayStr = {"Close Netflix", "Open Netflix", "Open chrome", "Close Netflix", "Open Terminal", "Clear", "Open zoom", "Open Netflix"};
        Map<String, Integer>  map = new HashMap<>();

        for(int i = 0 ; i  < arrayStr.length; i++) {


            String[] arrStr2 = arrayStr[i].split(" ");

            if (arrStr2[0].equals("Open")) {
                map.put(arrStr2[1], 1);
            } else if (arrStr2[0].equals("Close")) {
                map.put(arrStr2[1], 0);
            } else {
                for (String k : map.keySet()) {
                    map.put(k, 0);
                }
            }

            System.out.println("Map value after "+ i+" iteration " +map);
        }


        for(String k : map.keySet()){
            if( map.get(k).equals(1)){
                System.out.println(" Open Applications are " + k);
            }

        }


    }


}
