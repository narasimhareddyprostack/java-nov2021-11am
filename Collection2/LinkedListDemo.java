import java.util.*;
class LinkedListDemo{
    public static void main(String[] args){
    //LinkedList ll = new ArrayList();
    /* LinkedList<int> ll = new LinkedList<int>();
    LinkedList<String> ll = new LinkedList<String>(); */
   LinkedList ll = new LinkedList();
    ll.add("Vinnay");
    ll.add("Sahana");
    ll.add("Kavitha");
    System.out.println(ll);
    ll.addFirst("Preethi");
    System.out.println(ll);
    System.out.println(ll.get(0));
    System.out.println("Iterative Linked List - using for loop");
    //System.out.print(ll.get("Five"));

    for(int i=0;i<=ll.size()-1; i++){
        System.out.println(ll.get(i));
    }
    Collections.shuffle(ll);
    System.out.println("After Sorting!");
     System.out.println(ll);

    
    }
}