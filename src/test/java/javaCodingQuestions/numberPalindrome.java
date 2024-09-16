package javaCodingQuestions;

import javax.sound.midi.Soundbank;

public class numberPalindrome {


    public static void main(String[] args){

        int n = 5450;
        int revnum = 0;
        int rem;
        int original = n;


        while( n > 0 ){

            rem = n % 10 ;
            revnum = (revnum * 10) + rem;
            n = n/10;

        }

        if( original == revnum){
            System.out.println(" yes palindrome");
        }
        else {
            System.out.println(" not palindrome");

        }
    }

}
