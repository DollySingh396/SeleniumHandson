package javaCodingQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {


    public static void main(String[] args){

        String str = "hello";
        StringBuilder st = new StringBuilder();

        for( char ch : str.toCharArray()){

            if( !st.toString().contains(String.valueOf(ch))){
                st.append(ch);
            }
        }

        System.out.println(" string w/o dupliactes is "+st.toString());


    }
}
