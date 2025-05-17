import java.util.*;

public class MergeTwoSortedLists {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);


        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergedList = solution(l1, l2);

        while(mergedList != null){
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }


    }

    public static ListNode solution(ListNode list1, ListNode list2){
        ListNode mList = new ListNode(0);
        ListNode last = mList;

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                last.next = list2;
                list2 = list2.next;
            }else{
                last.next = list1;
                list1 = list1.next;
            }
            last = last.next;
        }

        if(list1 == null) last.next = list2;
        else last.next = list1;

        return mList.next;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }