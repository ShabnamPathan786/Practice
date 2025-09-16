//the two list are sorted
public class MergeTwoList{
    private ListNode head;



    public void insertLast(int val){
        ListNode newNode=new ListNode(val);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public MergeTwoList mergeTwoLists(MergeTwoList list1, MergeTwoList list2) {
        ListNode f = list1.head;
        ListNode s = list2.head;

        MergeTwoList ans = new MergeTwoList();;
    
    while(f!=null && s!=null)
    {
        if (f.val < s.val) {
            ans.insertLast(f.val);
            f = f.next;
        } else {
            ans.insertLast(s.val);
            s = s.next;
        }
    }
    while(f!=null){
        ans.insertLast(f.val);
        f = f.next;
    }

    while(s!=null){
        ans.insertLast(s.val);
        s = s.next;
    }
    return ans;
}
    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

     private class ListNode{
        int val;
        ListNode next;

        public ListNode(int value){
            this.val=value;
        }
     }

     public static void main(String[] args){
      
         MergeTwoList list1 = new MergeTwoList();
         list1.insertLast(1);
         list1.insertLast(3);
         list1.insertLast(5);
         list1.display();
         MergeTwoList list2 = new MergeTwoList();
         list2.insertLast(2);
         list2.insertLast(4);
         list2.insertLast(6);
        list2.display();
        MergeTwoList obj = new MergeTwoList();     // create an object
        MergeTwoList merged = obj.mergeTwoLists(list1, list2);
        merged.display();
     }
     
}