package javaCodingQuestions;

import java.util.HashSet;
import java.util.Set;

public class longestSubStringWithoutRepeatingCharacter {

    public static void main(String[] args){

        String input  = "abcabcbb";
        int l = 0;
        int startIndex = 0;
        int endIndex = 0;
        int currLength = 0;
        int maxLength = 0;
        Set<Character> s= new HashSet<>();

        for( int r = 0; r < input.length(); r++){

            while (s.contains(input.charAt(r))){
                s.remove( input.charAt(l) );
                l += 1;
            }

                s.add(input.charAt(r));

                currLength = r - l + 1;
                if( maxLength < currLength){
                    maxLength = currLength;
                    startIndex = l;
                    endIndex = r;
                }

        }

        System.out.println(" maxlength is " +maxLength);
        System.out.println(" l is "+startIndex+" and r is "+endIndex);
        System.out.println(" string is " +input.substring(startIndex,endIndex+1));

    }
}
