package javaCodingQuestions;

public class secMaxInArray {


    public static void main(String[] args){

        int[] arr = { 400, 781, 8, 99, 103, 200};
        int max = arr[0];
        int maxInd = 0;

        for( int i = 1; i < arr.length; i++){
            if( max< arr[i]){
                max = arr[i];
                maxInd = i;

            }
        }
        int secMax = arr[0];
        for( int i = 1 ; i < arr.length; i++){

            if( i != maxInd && secMax < arr[i]){
                secMax = arr[i];
            }
        }


        System.out.println("second maximum value is "+secMax);


    }
}
