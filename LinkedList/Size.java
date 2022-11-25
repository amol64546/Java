package SinglyLL;

public class Size {
    static int get(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
