public class DList {

    protected int size;
    protected Node head, tail;

    //empty list constructor
    public DList(){
        size = 0;
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public void addLast(int item){
        Node newNode = new Node(item);

        if(size() == 0){
            head.next = newNode;
            newNode.previous = head;
            tail.previous = newNode;
            newNode.next = tail;
        }
        else{
            (tail.previous).next = newNode;
            newNode.previous = tail.previous;
            tail.previous = newNode;
            newNode.next = tail;
        }
        size++;
        
    }

    public class Node{
        int item;
        Node previous;
        Node next;
        public Node(int item){
            this.item = item;
        }
    }

    //add method

    public void printNodes(){
        Node current = head.next;
        if(head.next  == tail){
            System.out.println("List is empty");
            return;
        }
        //System.out.println("Linked List contents: ");
        while(current != tail){
            System.out.print(current.item + " ");
            current = current.next;
        }
    }

    public DList swapNodes(DList list, int data1, int data2){
        //check if the list is empty, or has size 1
        if(list.isEmpty() || list.size() == 1){
            System.out.println("List is empty or size is 1");
            return list;
        }
        else{
            Node temp, current, swap;
            current = head.next;

            //find node with data1
            while(current.item != data1){
                current = current.next;
            }
            temp = current;
            current = head.next;
            //find node with data2
            while(current.item != data2){
                current = current.next;
            }
            //move the pointers arround
            swap = current;
            current = temp;
            temp = swap;
            return list;
        }





    }
}
