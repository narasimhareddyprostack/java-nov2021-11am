import java.util.*;
class ArrayListDemo{
    public static  void main(String[] args){

        ArrayList<String> al = new ArrayList<String>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        System.out.println(al);
        for(String name:al){
                System.out.println(name);
        }
        for(int i=0;i<al.size(); i = i+1){
            System.out.println(al.get(i));
        }
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
    }
}