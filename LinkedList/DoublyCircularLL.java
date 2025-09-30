public class DoublyCircularLL {
private Node head;
 private Node tail;
 private int size;

 public DoublyCircularLL(){
    this.head=null;
    this.tail=null;
    this.size=0;
 }
public void addFirst(int data){
    Node newNode=new Node(data,tail,head);
    size++;
    if(head==null){
      head=newNode;
      tail=newNode;
      newNode.next = newNode;
      newNode.prev = newNode;
    }
    else{
    head.prev=newNode;
    tail.next=newNode;
    head=newNode;
    }

}

public void addLast(int data){
    Node newNode = new Node(data,tail,head);
    size++;
    if(head==null){
      head=newNode;
      tail=newNode;
      newNode.next = newNode;
      newNode.prev = newNode;
    }
    else{
        head.prev=newNode;
        tail.next=newNode;
        tail=newNode;
    }
}

public void deleteFirst(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    if(head==tail){
        head=null;
        tail=null;
    }else{
        head=head.next;
        head.prev=tail;
        tail.next=head;
    }
    size--;
    return;
}

public void deleteLast(){
    if (head == null) {
        System.out.println("list is empty");
        return;
    }
    if (head == tail) {
        head = null;
        tail = null;
    }else{
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=head;
        head.prev=temp;
        tail=temp;
    }
}

private class Node {
 private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev=null;
        }
        public Node (int data,Node prev,Node next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[]args){
        DoublyCircularLL ll=new DoublyCircularLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.displayList();
        ll.addLast(8);
        ll.displayList();
        ll.deleteFirst();
        ll.deleteLast();
    //    System.out.println(ll.deleteLast());
        ll.displayList();
    }
    
}
