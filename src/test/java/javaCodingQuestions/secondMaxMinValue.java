package javaCodingQuestions;

public class secondMaxMinValue {


    public static void main(String[] args){


        int[] array = {4, 781, 8, 99, 103, 2, 1};

        int min = array[0];
        int max = array[0];
        int maxindex = 0;
        int minIndex = 0;
        int secMax = array[0];
        int secMin = array[0];



        for( int i  = 1; i < array.length; i++){

            if( min > array[i]){
                min = array[i];
                minIndex = i;
            }


            if( max < array[i]){
                max = array[i];
                maxindex = i;

            }


        }

        System.out.println(" Max value is "+max+" at index "+maxindex+" and Min value is "+min+" at index "+minIndex);


        for( int i = 1; i < array.length; i++){

            if( secMax < array[i] && i != maxindex ){
                secMax = array[i];
            }
            if( secMin > array[i]  && i != minIndex){
                secMin = array[i];
            }


        }


        System.out.println(" Second Max value is "+secMax+" and Second Min value is "+secMin);

    }
}
