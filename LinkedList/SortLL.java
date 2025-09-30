public class SortLL {
    private Node head;
    private Node tail;
    private int size;
    public SortLL(){
        this.size=0;
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
             head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
      }

      public Node sortList(Node head){
        if(head==null || head.next==null) return head;
        Node f=head;
        Node s=head;
        Node mid=null;
        while( f!=null && f.next!=null){
            mid=s;
            s=s.next;
            f=f.next.next;
        }
        mid.next=null;
        Node left=sortList(head);
        Node right=sortList(s);
        return merge(left,right);
}
     public Node merge(Node l,Node r){
        Node dummy=new Node(0);
        Node curr=dummy;
        while(l!=null && r!=null){
            if(l.data<r.data){
                curr.next=l;
                l=l.next;
            }else{
                curr.next=r;
                r=r.next;
            }
            curr=curr.next;
        }
        if(l!=null) curr.next=l;
        if(r!=null) curr.next=r;

        return dummy.next;

     }
      

    

    public void displayList(){
        if(head==null){
            System.out.println("list is empty");
        
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> " );
            temp=temp.next;
        }
         System.out.print("null" );
         System.out.println("");

         System.out.println("size of List := "+size);
    }

     private class Node {

        int data;
        Node next;

        //consturctor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    public static void main(String[] args){
    SortLL ll=new SortLL();
    ll.addFirst(1);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.addFirst(2);
    ll.addFirst(3);
    System.out.println("before sorting");
    ll.displayList();
    ll.head= ll.sortList(ll.head);
    System.out.println("after sorting");
    ll.displayList();
    }
    
}
