package LinkedList;
public class SinglyLinkedList {
    //here we will store all our implementation 
    public Node head;
    
    public void Traverse_SL() {
        Node ptr = head;
        if(ptr == null)
            System.out.println("LinkedList is Empty");
        else 
            while(ptr != null) {
                System.out.print(ptr.data + " ");
                ptr = ptr.link;
            }
        System.out.println();
    }
    
    public void InsertFront_SL(int data) {
        Node node = new Node();
        
        node.link = head;
        node.data = data;
        head = node;
    }
    
    public void InsertEnd_SL(int data) {
        Node node = new Node();
        
        Node ptr = head;
        while(ptr.link != null) {
            ptr = ptr.link;
        }
        ptr.link = node;
        node.data = data;
    }
    
    public void InsertAny_SL(int data, int key) {
        Node node = new Node();
        
        Node ptr = head;
        while(ptr.data != key) 
            ptr = ptr.link;
        if(ptr.link == null)
            System.out.println("KEY not avalible in the list");
        else {
            node.link = ptr.link;
            ptr.link = node;
            node.data = data;
        }
    }
    
    public void DeleteFront_SL() {
        Node ptr = head;
        if(ptr == null) {
            System.out.println("LinkedList is Empty: No deletion possible");
        } else {
            Node ptr1 = ptr.link;
            head = ptr1;
        }
    }
    
    public void DeleteEnd_SL() {
        Node ptr, ptr1 = null;
        ptr = head;
        if(ptr == null) {
            System.out.println("LinkedList is Empty: No deletion possible");
        } else {
            while(ptr.link != null) {
                ptr1 = ptr;
                ptr = ptr.link;
            }
            ptr1.link = null;
        }
    }
    
    public void DeleteAny_SL(int key) {
        Node ptr, ptr1 = null;
        ptr = head;
        while(ptr.data != key) {
            ptr1 = ptr.link;
            ptr = ptr.link;
        }
        if(ptr.link == null)
            System.out.println("Node with key does not exist: No deletion possible.");
    }
    
    
}
