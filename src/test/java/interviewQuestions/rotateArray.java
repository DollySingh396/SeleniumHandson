package interviewQuestions;

public class rotateArray {

    public static void main(String[] args) {

        // check a good solution for this problem that will work for all cases
        // given element is  5
        // move the element 5 to position 1

        int[] arr = {2, 4, 5, 6, 1, 3};
        int length = arr.length;
        int position = 2;
        int index= 0;

        // find index of element 5
        for(int i = 0; i < length; i++){
            if( arr[i] == 5 ){
                index = i;
            }
        }
        System.out.println("current index of 5 is "+index);

        int noOfIterations = 0;

        if(position >= index){
            noOfIterations = position - index;
        }
        else{
            noOfIterations = length - index + position;
        }

        System.out.println("no of iterations are "+noOfIterations);

        while (noOfIterations != 0) {

            int last = arr[length - 1];

            for (int i = length - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }

            arr[0] = last;
            noOfIterations--;


        }
        for (int i = 0; i < length; i++) {

            System.out.print(arr[i] + " ");

        }
    }
}
