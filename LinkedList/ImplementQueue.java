import java.util.*;
public class ImplementQueue {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public ImplementQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }
//insertion efficient   Amortized compelxity o(1)

    public void insert(int item) {
        first.push(item);
    }

    public int remove() {
       if(second.isEmpty()){        
                while(!first.isEmpty()){
                    second.push(first.pop());
                }
           }
           if(second.isEmpty()){
           throw new RuntimeException("queue is empty");
         
    }
      return second.pop();
}

// public int remove2() {
//     if (first.isEmpty()) {   // check if the queue is empty
//         throw new RuntimeException("Queue is empty");
//     }
//     while(!first.isEmpty()){
//         second.push(first.pop());
//     }
//     int removed=second.pop();
//     while(!second.isEmpty()){
//         first.push(second.pop());
//     }
//     return removed;
// }
        
   

// public boolean isEmpty(){
//     return second.isEmpty();
// }


//removel efficieant

public void add2(int item){
   while(!first.isEmpty()){
        second.push(first.pop());
    }

    first.push(item);
    while(!second.isEmpty()){
        first.push(second.pop());
    }
}

public int remove3(){
    return first.pop();
}
    public static void main(String[] args) {
        ImplementQueue ss = new ImplementQueue();
        ss.insert(1);
        ss.insert(2);
        ss.insert(3);
        System.out.println(ss.remove());
    

    }
}



