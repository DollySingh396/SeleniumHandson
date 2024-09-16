package javaCodingQuestions;

public class MinMaxInArray {


    public static void main( String[] args){

        int[] array = { 4, 781, 8, 99, 103};
        int l = array.length;
        int max = 0, min = 0;

        if( l % 2 == 0)
            minMaxEvenLengthArray(array, l, max, min);
        else
            minMaxOddLengthArray(array, l, max, min);


    }


    public static  void minMaxEvenLengthArray(int[] arr, int length, int max, int min){

        System.out.println(" Even length method is called");

            if( arr[0] < arr[1]){
                max = arr[1];
                min = arr[0];
            }
            else{
                max = arr[0];
                min = arr[1];
            }

            for( int i = 2; i < length; i++){

                if( max < arr[i]){
                    max = arr[i];
                }
                if(min > arr[i]){
                    min = arr[i];
                }

            }

        System.out.println("Max  no is "+max+ " and Min is "+min);

    }


    public static void minMaxOddLengthArray(int[] arr, int length, int max, int min){

        System.out.println(" Odd length method is called");

        min =  max = arr[0];

            for(int i = 1; i < length; i++){

                if( max < arr[i]){
                    max = arr[i];
                }
                if(min > arr[i]){
                    min = arr[i];
                }
            }

        System.out.println("Max  no is "+max+ " and Min is "+min);

    }

}

