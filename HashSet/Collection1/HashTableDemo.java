import java.util.*;

class HashTableDemo{
	public static void main(String[] args) {
	Hashtable ht = new Hashtable();
	ht.put("id","101");
	ht.put("name","Rahul Gandhi");
	ht.put("sal", "45000");
	/* System.out.println(ht);

	System.out.println(ht.keySet());
 	System.out.println(ht.values());
	System.out.println(ht.get("sal"));
	
	for(Object key: ht.keySet()){
     System.out.println(key+ " " + ht.get(key));
	} */

	/* Set s = ht.entrySet(); */
     Set setHt = ht.entrySet();

     Iterator it = setHt.iterator();

      while(it.hasNext()){
         Map.Entry<String, Integer> e = (Map.Entry) it.next();
         System.out.println(e.getKey() + " : " + e.getValue());
      }
}
}