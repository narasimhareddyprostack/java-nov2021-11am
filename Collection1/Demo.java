import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(10);
    
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(2));
        al.set(0,10.5);
        System.out.println(al);

        //check given array list is empty or not?
        System.out.println(al.isEmpty());
    }
}