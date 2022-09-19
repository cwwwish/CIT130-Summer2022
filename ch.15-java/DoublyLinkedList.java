/*
Christopher Wischmann
CIT 130
July 16th, 2022
Proves list is doubly linked/cloned
*/

public class DoublyLinkedList {
    public static void main(String[] args) throws CloneNotSupportedException {
        LinkedList3<String> linkedList3= new LinkedList3<>();
        linkedList3.addToStart("Hello1");
        linkedList3.addToStart("Hello2");
        linkedList3.addToStart("Hello3");
        linkedList3.addToStart("Hello4");
        linkedList3.iterateForward();
        linkedList3.iterateBackward();
        
        System.out.println("To String method");
        System.out.println(linkedList3.toString());
    
        LinkedList3<String> clonedObj=(LinkedList3<String>) linkedList3.clone();
    
        System.out.println("printing cloned object");
        clonedObj.iterateForward();
    }
}
