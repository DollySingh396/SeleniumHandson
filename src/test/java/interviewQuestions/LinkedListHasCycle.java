//package javaCodingQuestions;
//
//// importing ListNode Class here
////import interviewQuestions.ListNode;
//
//
//public class LinkedListHasCycle {
//
//     public static boolean hasCycle(ListNode head){
//
//
//          if( head == null || head.next == null){
//               return false;
//          }
//          ListNode slow = head;
//          ListNode fast = head.next;
//
//          while( slow != fast){
//
//               if( fast == null || fast.next == null){
//                    return false;
//               }
//
//               slow = slow.next;
//               fast = fast.next.next;
//          }
//
//          return true;
//     }
//
//     public static void main(String[] args){
//
//          // Create linked list with a cycle
//
////          // creating object of ListNode class
////          ListNode head = new ListNode(1);
////          ListNode second = new ListNode(2);
////          ListNode third = new ListNode(3);
//
//          head.next = second;
//          second.next = third;
//          third.next = head;
//
//          boolean hasCycle = hasCycle(head);
//          System.out.println(" Cycle exists in linked list "+hasCycle);
//
//
//
//     }
//}
