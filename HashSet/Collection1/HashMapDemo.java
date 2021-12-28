package Collection1;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap m = new HashMap();
		m.put(null, null);
		m.put("id", "101");
		m.put("name", "Rahul Gandhi");
		m.put("sal",45000);
		System.out.println(m);
		m.remove(null);
		System.out.println(m);
		System.out.println(m.isEmpty());
		
		System.out.println(m.size());
		
		Set s = m.keySet();
		System.out.println(s);
		Collection s2 = m.values();
		System.out.println(s2);

	}

}
