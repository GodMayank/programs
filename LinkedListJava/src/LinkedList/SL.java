package LinkedList;
public class SL {
    public Node head;
    public void Traverse_SL() {
        Node ptr = head;
        if(ptr == null) 
            System.out.println("Linked List is Empty!");
        while(ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.link;
        }
        System.out.println();
    }
    public void InsertFront_SL(int data) {
        Node ptr = new Node();
        ptr.link = head;
        ptr.data = data;
        head = ptr;        
    }
    public void InsertEnd_SL(int data) {
        Node node = new Node();
        
        Node ptr = head;
        while(ptr.link != null)
            ptr = ptr.link;
        ptr.link = node;
        node.data = data;
    }
    public void InsertAny_SL(int data, int key) {
        Node node = new Node();
        node.data = data;
        
        Node ptr = head;
        while(ptr.data != key && ptr.link != null) {
            ptr = ptr.link;
        }
        if(ptr.data != key)
            System.out.println("Key not found, Invalid key!");
        else {
            node.link = ptr.link;
            ptr.link = node;
        }
    }
    public void DeleteEnd_SL() {
        Node ptr = head; 
        Node ptr1 = null;
        while(ptr.link != null) {
            ptr1 = ptr;
            ptr = ptr.link;
        }
        ptr1.link = null;
    }
    public void DeleteFront_SL() {
        Node ptr = head;
        if(ptr == null)
            System.out.println("Linked List is Empty, Can't delete an item!");
        else
            head = ptr.link;
    }
    public void DeleteAny_SL(int key) {
        Node ptr1 = head;
        Node ptr = ptr1.link;
        while(ptr != null) {
            if(ptr.data != key) {
                ptr1 = ptr;
                ptr = ptr.link;
            } else {
                ptr1.link = ptr.link;
                break;
            }
        }
        if(ptr == null) 
            System.out.println("Node with key does not exist. No Deletion!");
    }
    public void Copy_SL() {
        Node 
    }
}
