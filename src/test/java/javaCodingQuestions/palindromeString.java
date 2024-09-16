package javaCodingQuestions;

public class palindromeString {


    public static void main(String[] args){

        String str = "annaa";
        char[] ch = str.toCharArray();
        boolean flag = true;
        int l = ch.length;

        for( int i = 0; i < l; i++){

            if(ch[i] != ch[l - 1]){
                flag=false;
                break;
            }
            l--;
        }

        System.out.println("String is palindrome "+flag);
    }
}
