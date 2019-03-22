package LinkedList;
public class Index {
    public static void main(String args[]) {
        //Traversing the list
        //Inserting node into the list
        //Deleting the node into the list.
        //Copying the list to make a duplicate of it.
        //Merging the linked list with another one to make a larger list.
        //Serching for an element in the list.
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.Traverse_SL();
//        list.DeleteEnd_SL();
//        list.DeleteFront_SL();
//        list.InsertFront_SL(1);
//        list.InsertFront_SL(2);
//        list.InsertFront_SL(3);
//        list.InsertFront_SL(4);
//        list.InsertFront_SL(5);
//        
//        list.InsertEnd_SL(-1);
//        list.InsertEnd_SL(-2);
//        list.InsertEnd_SL(-3);
//        list.InsertEnd_SL(-4);
//        
//        list.InsertAny_SL(0, 1);
//        list.InsertAny_SL(0, 1);
//        list.Traverse_SL();
//        
//        list.DeleteFront_SL();
//        list.DeleteEnd_SL();
//        list.DeleteAny_SL(0);
//        list.Traverse_SL();
        SL list = new SL();
        list.InsertFront_SL(23);
        list.InsertFront_SL(232);
        list.InsertEnd_SL(10);
        list.InsertEnd_SL(45);
        list.InsertAny_SL(0, 23);
        list.DeleteEnd_SL();
        list.DeleteFront_SL();
        list.DeleteAny_SL(0);
        list.DeleteAny_SL(23);
        list.Traverse_SL();
    }
}
