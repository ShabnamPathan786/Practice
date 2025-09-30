public class SinglyCircularLL {
 private Node head;
 private Node tail;
 private int size;

 public SinglyCircularLL(){
    this.head=null;
    this.tail=null;
    this.size=0;
 }

public void addFirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
       head=newNode;
       tail=newNode;
       newNode.next=head; 
       return;
    }
    newNode.next=head;
    head=newNode;
    tail.next=head;
}

public void addLast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
       head=newNode;
       tail=newNode;
       newNode.next=head; 
       return;
    }
    tail.next=newNode;
    tail=newNode;
    tail.next=head;
}

public int deleteFirst(){
    if(head==null){
        return 0;
    }
    int val=head.data;
    if(head==tail){  //necessory check as if only one node present will point to iself;
     head=tail=null;
    }else{
    head=head.next;
    tail.next=head;
    }
    size--;
    return val;
}

public int deleteLast(){
    if (head == null) {
        return 0;
    }
    int val=tail.data;
    if (head == tail) {  //necessory check as if only one node present will point to iself;
        head = tail = null;
    }else{
        Node temp=head;
        while(temp.next!=tail) {
         temp=temp.next;
        }
        temp.next = head;
        tail=temp;
    }
    size--;
    return val;
}

public void displayList(){
    if (head == null) {
        System.out.println("List is empty!");
        return;
    }
    Node temp=head;
    do{
        System.out.print(temp.data+ "->");
        temp=temp.next;
    }while(temp!=head);
    System.out.println("(back to head)");
}


    private class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args){
        SinglyCircularLL ll=new SinglyCircularLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.displayList();
        ll.addLast(8);
       System.out.println(ll.deleteLast());
        ll.displayList();

        
    }
    
}
