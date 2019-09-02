public class AddTwoNumbers {
    // A simple Java program for traversal of a linked list
        Node head; // head of list

        /* Linked list Node.  This inner class is made static so that
           main() can access it */
        static class Node {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            } // Constructor
        }

        /* This function prints contents of linked list starting from head */
        public String printList()
        {
            String num1="";
            Node n = head;
            while (n != null) {
                System.out.println(n.data + " ");
                num1=num1.concat(Integer.toString(n.data));
                n = n.next;
            }
            return num1;
        }

        public static void printAnswer(Node nd)
        {

        Node n = nd;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
        }

        public static Node newList(String str){
            AddTwoNumbers list = new AddTwoNumbers();
            list.head = new Node(0);
            Node p3 = list.head;
            for (int i=0; i<str.length();++i){
                int val  = Integer.parseInt(String.valueOf(str.charAt(i)));
                p3.next = new Node(val%10);
                p3=p3.next;
            }
            return list.head.next;
        }

        /* method to create a simple linked list with 3 nodes*/
        public static void main(String[] args)
        {
            /* Start with the empty list. */
            AddTwoNumbers llist = new AddTwoNumbers();

            llist.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);

            llist.head.next = second; // Link first node with the second node
            second.next = third; // Link first node with the second node

            String num1 = llist.printList();
            StringBuilder number1 = new StringBuilder();
            number1.append(num1);
            number1 = number1.reverse();
            System.out.println(number1);

            int num = Integer.valueOf(String.valueOf(number1));
            String answer = String.valueOf(num + 546);
            StringBuilder final_answer = new StringBuilder();
            final_answer.append(answer);
            final_answer = final_answer.reverse();

            System.out.println(answer);

            printAnswer(newList(String.valueOf(final_answer)));
        }
    }

    /* solution found
    public class Solution {
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
int carry =0;
ListNode newHead = new ListNode(0);
ListNode p1 = l1, p2 = l2, p3=newHead;
while(p1 != null || p2 != null){
if(p1 != null){
carry += p1.val;
p1 = p1.next;
}
if(p2 != null){
carry += p2.val;
p2 = p2.next;
}
p3.next = new ListNode(carry%10);
p3 = p3.next;
carry /= 10;
}
if(carry==1)
p3.next=new ListNode(1);
return newHead.next;
     */
