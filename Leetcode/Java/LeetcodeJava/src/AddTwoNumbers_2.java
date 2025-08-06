/*You are given two non-empty linked list representing two non-negative integers. The digits are stored in reverse order, and each
of their nodes contais a single digit. Add the two numbers and return the sum as a linked list.

You many assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = {2,4,3}, l2 = {5,6,4}
Output: {7,0,8}
Example 2:
Input: l1 = {0}, l2 = {0}
Output: {0}
Example 3:
*/
public class AddTwoNumbers_2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int total = 0, carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            total = carry;
            
            if(l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }
            
            int num = total % 10;
            carry = total / 10;
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }
        
        return res.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); 
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode sumList = addTwoNumbers(l1, l2);
        
        while (sumList != null) {
            System.out.print(sumList.val);
            if (sumList.next != null) {
                System.out.print(" -> ");
            }
            sumList = sumList.next;
        }
        
        System.out.println("");
    }
}
