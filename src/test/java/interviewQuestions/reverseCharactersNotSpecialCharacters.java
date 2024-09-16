package interviewQuestions;

import java.util.Arrays;

public class reverseCharactersNotSpecialCharacters {

    public static void main(String[] args){
        String str = "abcd%ef";
        char[] chArray = str.toCharArray();

        int start = 0;
        int end = chArray.length - 1;

        System.out.println("Original string is "+ str);

        while( start<= end){

            if( chArray[start] == '%')
            {
                start++;
                continue;
            }
            if( chArray[end] == '%' ) {
                end--;
                continue;
            }
            char temp;
            temp = chArray[start] ;
            chArray[start] = chArray[end];
            chArray[end] = temp;
            start++;
            end--;

        }


        str = Arrays.toString(chArray);
        System.out.println("Reversed string is "+str);
    }
}
