package javaCodingQuestions;

public class linkedListHasACycle {

    public static void main(String[] args) {

        linkedListConstructor firstNode = new linkedListConstructor(1);
        linkedListConstructor secondNode = new linkedListConstructor(2);
        linkedListConstructor thirdNode = new linkedListConstructor(3);
        linkedListConstructor fourthNode = new linkedListConstructor(4);

        linkedListConstructor head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;

        if (head == null || head.next == null) {
            System.out.println(" linked list do not has a cycle");
        } else {
            linkedListConstructor slow = head;
            linkedListConstructor fast = head.next;
            boolean flag = true;

            while (slow != fast) {

                if (fast == null || fast.next == null) {
                    System.out.println(" linked list do not has a cycle");
                    flag = false;
                    break;
                }

                slow = slow.next;
                fast = fast.next.next;

            }

            if (flag)
                System.out.println(" linked list has a cycle");


        }
    }
}
