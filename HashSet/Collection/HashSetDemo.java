package Collection;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {  
		
		//HashSet set1 = new HashSet();
		//with default memory location 16 and load factor - 0.75
		//HashSet set1 = new HashSet(100);
		HashSet set1 = new HashSet(100, (float)0.90);
		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Four");
		set1.add("Four");
		set1.add("Four");
		System.out.println(set1.size());
		for(Object obj:set1) {
			System.out.println(obj);
		}
		/*for(int i=0; i<=set1.size()-1 ;i ++) {
			System.out.println(set1[i]);
		}*/
		System.out.print(set1.isEmpty());
		set1.remove("Four");
		System.out.println(set1);

	}

}
