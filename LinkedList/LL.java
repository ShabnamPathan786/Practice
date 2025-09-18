public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(int size){
        this.size=size;
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

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
              head=tail=newNode;
              return;
         }
         tail.next=newNode;
         tail=newNode;
         
    }


    public void addMiddle(int data,int index){
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==size){
            addLast(data);
            return;
        }
             Node temp=head;
             for(int i=1;i<index;i++){
                temp=temp.next;
             }
             Node newNode=new Node(data,temp.next);
             size++;
             temp.next=newNode;
    }


    public  int removeFirst(){
        if(head==null){
            tail=null;
            System.out.println("list is empty");
            return -1;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

        
        
    
    }


    
    
    public int removeLast(){
        if(head==null){
            System.out.println("List is empty");
            return -1;
        }
        
        if(head.next==null){
           return removeFirst();
         }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
        

    }
    
    
     public int  romoveMiddle(int index){
             if(head==null){
                System.out.println("List is empty");
             }
             if(index==0){
                return removeFirst();
             }
             if(index==size-1){
                return removeLast();
             }
             Node temp=head;
             for(int i=1;i<index;i++){
                    temp=temp.next;
             }
             int val=temp.next.data;
             temp.next=temp.next.next;
             size--;
             return val;
}


public Node findNode(int val){
    if(head.data==val){
        return head;
    }
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return temp;
            }
            temp=temp.next;
        }
       return null;
}

// INSERT AT INDEX USING RECURSION  can do this void retrun datatype check it for at once..


public Node insertAtIdx(Node node,int index,int val){
    if(index<0) return node;

    if(index==0){
        Node newNode=new Node(val);
        newNode.next=node;
        size++;
        return newNode;
    }
     if (node == null) return null;
    node.next=insertAtIdx(node.next,index-1,val);
    return node;
}

public Node reverse (Node head){
    if(head==null ||head.next==null) return head;

    Node node=reverse(head.next);

   head.next.next=head ;
   head.next=null;
   return node;
    
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



   
   
   
   
   
    private class Node{
    int data;
    Node next;

    //consturctor
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public Node(int data,Node next){
       this.data=data;
       this.next=next; 
    }
   } 


   public static void main(String[] args){
     LL ll=new LL(0);
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    //ll.addMiddle(8,2);
    // System.out.println(ll.removeFirst());
    //  System.out.println(ll.removeLast());
    ll.addFirst(3);
    //System.out.println(ll. romoveMiddle(2));
     //Node found=ll.findNode(2);
     //System.out.println(found.data);
     //ll.head=ll.insertAtIdx(ll.head,2,99);
     ll.displayList();
     Node ans=ll.reverse(ll.head);
     while(ans!=null){
        System.out.print(ans.data +" -> ");
        ans=ans.next;
     }

    

    ll.displayList();

   }

}
