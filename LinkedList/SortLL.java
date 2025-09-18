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
        if(head==null || head.next==null) return haed;
        //SortLL ans=new SortLL();
        Node f=head;
        Node s=haed.next;
        while(f!=null && s!=null){
            if(f.data>s.data){
                
            }

        }
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
    }
    
}
