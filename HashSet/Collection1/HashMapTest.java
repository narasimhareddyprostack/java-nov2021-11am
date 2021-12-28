package Collection1;
import java.util.*;
public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("id", "101");
		m.put("name", "Rahul Gandhi");
		
		Set s = m.entrySet();
		System.out.println(s);
		System.out.println(m.get("name"));
		
		for (Map.Entry<String, String> entry : m.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
	}

}
