package javaCodingQuestions;

public class sumofLinkedList {

    public static void main(String[] args) {

        linkedListConstructor firstNode = new linkedListConstructor(9);
        linkedListConstructor secondNode = new linkedListConstructor(9);
        linkedListConstructor thirdNode = new linkedListConstructor(9);
        linkedListConstructor fourthNode = new linkedListConstructor(9);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedListConstructor oneNode = new linkedListConstructor(9);
        linkedListConstructor twoNode = new linkedListConstructor(9);
        linkedListConstructor threeNode = new linkedListConstructor(9);

        oneNode.next = twoNode;
        twoNode.next = threeNode;

        linkedListConstructor head1 = firstNode;
        linkedListConstructor head2 = oneNode;

        linkedListConstructor dummy = new linkedListConstructor(-1);
        linkedListConstructor res = dummy;

        int carry = 0;

        while( head1 != null || head2 != null){
            int sum = 0;
            sum += carry;

            if( head1 != null){
                sum += head1.val;
                head1 = head1.next;
            }
            if( head2 != null){
                sum += head2.val;
                head2 = head2.next;
            }

            carry = sum/10;
            sum = sum % 10;

            linkedListConstructor newNode = new linkedListConstructor(sum);
            res.next = newNode;
            res = res.next;

        }

        if(carry != 0){
            linkedListConstructor newNode = new linkedListConstructor(carry);
            res.next = newNode;
        }

        linkedListConstructor result = dummy.next;
        while( result != null ){
            System.out.println( " sum in reverse is " +result.val);
            result = result.next;
        }

    }

}
