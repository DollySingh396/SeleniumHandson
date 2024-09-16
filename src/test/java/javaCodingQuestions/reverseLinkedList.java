package javaCodingQuestions;

public class reverseLinkedList {

    public static void main(String[] args) {

        linkedListConstructor firstNode = new linkedListConstructor(1);
        linkedListConstructor secondNode = new linkedListConstructor(2);
        linkedListConstructor thirdNode = new linkedListConstructor(3);
        linkedListConstructor fourthNode = new linkedListConstructor(4);

        linkedListConstructor head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedListConstructor currentNode = head;
        linkedListConstructor prevNode = null;

        while( currentNode != null){
            linkedListConstructor nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;

        }

        head = prevNode;

        while( head != null){
            System.out.println(" value is "+head.val);
            head = head.next;
        }





    }
}
