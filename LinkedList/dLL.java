public class dLL {
    private Node head;
    private Node tail;
    private int size;

     
    public dLL(){
        this.size=0;
        this.head=null;
        this.tail=null;
    }


public void addFirst(int val){
    Node newNode=new Node(val,null,head);
    size++;
    if(head==null){
       head=tail=newNode;
       return;
    }
    head.prev=newNode;
    head=newNode;


}


public void addLast(int val){
    Node newNode=new Node(val,tail,null);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;

    //if tail was not provided then traverse node.next=null 
    // Node newNode2=new Node(val);
    //   Node temp=head;
    //   while(temp.next!=null){
    //     temp=temp.next;
    //   }
    //   
    //  temp.next = newNode;
    //  newNode.prev = temp;
    //  size++;
      
         
}

public int removefirst(){
    if(head==null){
        System.out.println("List is empty");
        return -1;
    }
     int val=head.data;
    if(head.next==null){
       head=tail=null;
    }
    else{
        head=head.next;
        head.prev=null;
    }
    size--;
    return val;
}

public void display(){
    if(head==null && tail==null){
        System.out.println("List is empty");
        return;
    }
    Node temp=head;
    Node last=head;
    while(temp!=null){
        last=temp;
        System.out.print(temp.data+" -> ");
        temp=temp.next;
    }
    System.out.print("null\n");

    
    //print in reverse
   
    System.out.println("reverse of list");
    Node temp2=tail;
    while(temp2!=null){
        System.out.print(temp2.data+" -> ");
        temp2=temp2.prev;
    }
     System.out.print("null\n");

     //another way to print in reverse if tail not provided

     while(last!=null){
        System.out.print(last.data+" -> ");
        last=last.prev;
     }
       System.out.print("null\n");



}


   private class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

        public Node(int data,Node prev,Node next){
                this.data=data;
                this.next=next;
                this.prev=prev;
        }
    }

    public static void main(String[] args){
        dLL ll=new dLL();
        ll.display();
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addLast(8);
        ll.removefirst();
        ll.display();



    }
    
}
