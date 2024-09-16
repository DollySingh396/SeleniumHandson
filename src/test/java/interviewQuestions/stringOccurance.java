package interviewQuestions;

public class stringOccurance {


    public static void main(String[] args){


        String str = "eeabbeee";
        String res = "";


        int length = 0;
        int  l = 0;
        int r = 1;

        while( r < str.length()){

            System.out.println(" value at l is " + str.charAt(l) + " value at r is " +str.charAt(r));

            if(str.charAt(l) == str.charAt(r)) {

                r++;
                System.out.println("match, increment r " +r );
            }
            else{


                length = r - l ;
                System.out.println("not match length is " +length);
                res += str.charAt(l);
                res += length;
                System.out.println("res string is "+res);
                l = r;
                r++;
                System.out.println("new l is "+l +" new r is "+r);

            }
        }

        res += str.charAt(l);
        length = r - l;
        res += length;

        System.out.println("ouput is "+res);

    }



}
