package javaCodingQuestions;

public class largestContiguousSumSubArray {


    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int currSum  = 0;
        int maxSum = nums[0];
        int l = 0, r = 0;


        for( int i = 0; i  < nums.length; i++) {

            if( currSum < 0){
                currSum = 0;
                l=i;
                r=i;
            }
            currSum += nums[i];
            System.out.println("current sum is "+currSum);
            if( currSum> maxSum){
                maxSum = currSum;
                r = i;
            }
//            maxSum = Math.max(currSum, maxSum);
            System.out.println("max sum after each iteration "+maxSum);

        }

        System.out.println(" left index is "+l+" right index is "+r);


        System.out.println("max sum is"+maxSum);
    }
}
