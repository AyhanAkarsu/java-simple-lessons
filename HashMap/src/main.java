import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class main {
	public static void Sirala(Map<Integer,String> sirala) {
		for(Map.Entry<Integer,String> entry : sirala.entrySet()) {
			System.out.println("Anahtar: "+entry.getKey()+" Deger: "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		Map<Integer,String> hashmap = new HashMap<Integer,String>();
		Map<Integer,String> sira1 = new LinkedHashMap<Integer,String>();
		Map<Integer,String> sira2 = new TreeMap<Integer,String>();
		hashmap.put(3,"A");
		hashmap.put(2,"B");
		hashmap.put(1,"C");
		
		sira1.put(3,"A");
		sira1.put(2,"B");
		sira1.put(1,"C");
		
		sira2.put(3,"A");
		sira2.put(2,"B");
		sira2.put(1,"C");
		
		System.out.println("****HashMap*****");
		Sirala(hashmap);
		System.out.println("****LinkedHashMap*****");
		Sirala(sira1);
		System.out.println("****TreeMap*****");
		Sirala(sira2);
		
		

	}

}
