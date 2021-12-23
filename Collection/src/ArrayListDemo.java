import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
   LinkedList al = new LinkedList();
		
		al.add("A");
		al.add(0,"B");
		al.add("C");
		al.add(10);
		al.add(null);
		
		al.remove();
		al.remove();
		al.remove(0);
		//al.remove(10);
		al.addFirst("Hello");
		al.remove("Hello");
		System.out.println(al);

	}

}
