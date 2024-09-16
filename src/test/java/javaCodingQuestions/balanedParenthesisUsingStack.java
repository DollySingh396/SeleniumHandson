package javaCodingQuestions;

import java.util.Stack;

public class balanedParenthesisUsingStack {


    public static void main(String[] args){

        String input = "[({})]";
        Stack<Character> stck = new Stack<>();

        for( int i = 0; i < input.length(); i++){

            if( input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{' ){
                stck.push(input.charAt(i));
                System.out.println(" Stack after push" +stck);
            }
            if( input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}' ){
                char c = stck.peek();
                if( c == '(' &&  input.charAt(i) == ')' ){
                    stck.pop();
                    System.out.println(" Stack after pop ( " +stck);

                }

                else if( c == '{' &&  input.charAt(i) == '}' ){
                    stck.pop();
                    System.out.println(" Stack after pop { " +stck);

                }

                else if( c == '[' &&  input.charAt(i) == ']' ){
                    stck.pop();
                    System.out.println(" Stack after pop [" +stck);



                }

                else break;

            }

        }

        if(stck.isEmpty()){
            System.out.println(" String is balanced");
        }
        else {
            System.out.println(" String is NOT balanced");

        }

    }

}
