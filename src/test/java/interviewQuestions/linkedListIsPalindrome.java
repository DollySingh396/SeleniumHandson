package interviewQuestions;

public class linkedListIsPalindrome {


//    I/P r-->a-->d-->a-->r
//    null r  a
//     r     a  null
//    null a r


    public static void main(String args[]) {

        char first = 'r';
        char second = 'a';
        char third = 'd';
        char fourth = 'a';
        char fifth = 'r';

        ListNode firstNode = new ListNode(first);
        ListNode secondNode = new ListNode(second);
        ListNode thirdNode = new ListNode(third);
        ListNode fourthNode = new ListNode(fourth);
        ListNode fifthNode = new ListNode(fifth);

        ListNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        ListNode current = firstNode;


        ListNode next;
        ListNode current1 = head;
        ListNode prev = null;
        String original = "";
        String  rev = "";


        while (current != null) {

            original += current.val;
            current = current.next;
        }

        System.out.println(" before value of node " +original);


        while( current1 != null){
            next = current1.next;
            current1.next = prev;
            prev = current1;
            current1 = next;

        }

        head = prev;


        while( head != null ){
            rev += head.val;
            head = head.next;

        }

        System.out.println(" after value of node " +rev);
        System.out.println(" Is palindrome ? " + original.equals(rev) );












    }

}
