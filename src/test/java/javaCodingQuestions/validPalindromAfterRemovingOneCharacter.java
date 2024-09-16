package javaCodingQuestions;

public class validPalindromAfterRemovingOneCharacter {

    public static void main(String[] args) {

        String input = "raddardr";
        int l = 0;
        int r = input.length()-1;

        boolean flag = validPalindrome(input, l, r);
        System.out.println(" Flag is "+flag);
    }

    public static boolean validPalindrome(String input,int l, int r){


        while( l <=r ){

            if( input.charAt(l) == input.charAt(r)){
                l++;
                r--;
            }
            else{
                return  isPalindrome(input, l+1, r) || isPalindrome(input, l , r-1) ;
            }
        }
        return true;


    }


    public static boolean isPalindrome(String input, int left, int right){

        while( left <= right){
            if( input.charAt(left) == input.charAt(right)){
                left++;
                right--;
            }
            else {
                return false;
            }
        }
        return true;
    }

}
