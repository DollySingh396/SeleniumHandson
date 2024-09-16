package javaCodingQuestions;

public class mergeTwoSortedLinkedLists {


    public static void main(String[] args) {

        linkedListConstructor firstNode = new linkedListConstructor(1);
        linkedListConstructor secondNode = new linkedListConstructor(2);
        linkedListConstructor thirdNode = new linkedListConstructor(4);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;

        linkedListConstructor oneNode = new linkedListConstructor(1);
        linkedListConstructor twoNode = new linkedListConstructor(3);
        linkedListConstructor threeNode = new linkedListConstructor(4);

        oneNode.next = twoNode;
        twoNode.next = threeNode;

        linkedListConstructor head1 = firstNode;
        linkedListConstructor head2 = oneNode;

        linkedListConstructor dummy = new linkedListConstructor(-1);
        linkedListConstructor res = dummy;


        while( head1 != null && head2 != null){


            if( head1.val <= head2.val){
                res.next = head1;
                res = res.next;
                head1 = head1.next;
            }
            else{
                res.next = head2;
                res = res.next;
                head2 = head2.next;

            }

        }

        if(head1 != null){
            res.next = head1;
        }
        if( head2  != null){
            res.next = head2;
        }

        linkedListConstructor result = dummy.next;
        while ( result != null ){
            System.out.println(" sorted list is "+result.val);
            result = result.next;
        }

    }


}
