package Lab12;

class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T>{
    Node<T> head;
    LinkedList(){
        this.head =null;
    }

    void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
        }else{
            Node<T> curr = head;
            while(curr.next!=null)
                curr = curr.next;
            curr.next = newNode;
        }
    }

    void display(){
        Node<T> curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        LinkedList<Integer> i = new LinkedList<>();
        LinkedList<Double> d = new LinkedList<>();

        i.add(1);
        i.add(2);
        i.add(3);

        d.add(1.3);
        d.add(2.3);
        d.add(4.3);

        i.display();
        System.out.println();
        d.display();
    }
}
