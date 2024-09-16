package interviewQuestions;

public class secMaxinArray {


    public static void main( String[] args){

        int[] array = {19, 45, 4, 3, 18, 11};

        int max, secMax, maxIndex = 0;

        if( array[0] > array[1]){

            max = array[0];
            maxIndex = 0;
            secMax = array[1];
        }
        else{
            max = array[1];
            maxIndex = 1;
            secMax = array[0];
        }


        for( int i = 2; i < array.length; i++){

            if( array[i] > max){
                max = array[i];
                maxIndex= i;

            }
            else{

                if( array[i] > secMax && maxIndex != i){
                    secMax = array[i];
                }
            }
        }

        System.out.println(" secMax is" + secMax);

    }

}
