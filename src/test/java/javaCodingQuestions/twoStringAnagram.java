package javaCodingQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoStringAnagram {


    public static void main(String[] args){


//        METHOD 1
//        String str1 = "listen";
//        String str2 =  "silent";
//        char[] ch1  = str1.toCharArray();
//        char[] ch2 = str2.toCharArray();

//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//
//        boolean flag = Arrays.equals(ch1, ch2);
//        System.out.println(" strings are anagram " +flag);



        // METHOD 2
        String s1 = "listen";
        String s2 = "silent";



        if( s1.length() != s2.length()){
            System.out.println(" Strings are NOT anagram");
        }
        else{

            Map<Character, Integer> map = new HashMap<>();

            for( int i = 0; i < s1.length(); i++){

                if(map.containsKey(s1.charAt(i))) {
                    map.put(s1.charAt(i), map.get(s1.charAt(i) )+ 1);
                }

                else{
                    map.put(s1.charAt(i), 1);
                }

            }

            System.out.println(" map value is "+map);



            for( int i = 0; i < s2.length(); i++){

                if(map.containsKey(s2.charAt(i))) {

                    if( map.get(s2.charAt(i)) > 1 )
                        map.put(s2.charAt(i), map.get(s2.charAt(i) ) - 1);
                    else
                        map.remove(s2.charAt(i));
                }

            }



            if(map.isEmpty()) {
                System.out.println(" Strings are Anagram");
            }
            else
                System.out.println(" Strings are NOT Anagram");

        }
    }


}
