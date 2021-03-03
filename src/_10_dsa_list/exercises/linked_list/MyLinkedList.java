package _10_dsa_list.exercises.linked_list;

public class MyLinkedList<E> {
    Node head;
    int numNodes;

    public MyLinkedList(){

    }

    public void add(int index, E element){
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public  void addFirst (E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast (E e){
        Node temp = head;
        for (int i=0 ; i<numNodes;i++){
            temp=temp.next;
        }
        temp.next=new Node(e);
        numNodes++;
    }

    public E remove (int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
        return (E)temp;
    }

    public boolean remove( Object e){
        Node temp = head;
        for (int i=0 ; i<numNodes;i++){
            if (temp.next.equals(e)){
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
        }
        return false;
    }

    public int size(){
        Node temp = head;
        int count=0;
        for (int i=0;i<numNodes;i++){
            count++;
        }
        return count;
    }


}
