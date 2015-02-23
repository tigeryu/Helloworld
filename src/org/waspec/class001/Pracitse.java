package org.waspec.class001;

/**
 * Created by v-daisyq on 2/23/2015.
 */
public class Pracitse {
    public static void main(String[] args) {
    }
    public ListNode deleteDuplicates(ListNode head){
        ListNode n=head;
        while (n!=null){
            if(n.next!=null&&n.next.var==n.var){
                n.next=n.next.next;
            }else {
                n=n.next;
            }
        }
        return head;
    }

}
class ListNode{
int var;
    ListNode next;
    ListNode(int x){
        var=x;
        next=null;
    }
}
