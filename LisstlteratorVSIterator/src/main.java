import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		list.add("Java");
		list.add("Python");
		list.add("C");
		list.add("Go");
		
		set.add("Python");
		set.add("Matlab");
		set.add("Java");
		set.add("R");
/*
 * Iteratorlerde previous() komutu yoktur.
 */
		Iterator<String> iterator1 = list.iterator();
		Iterator<String> iterator2 = set.iterator();
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		System.out.println("*************************");
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
	System.out.println("*******listiterator*******");
	ListIterator<String> listIterator1 = list.listIterator();
	while(listIterator1.hasNext()) {
		System.out.println(listIterator1.next());
	}
	System.out.println("*************");
	while(listIterator1.hasPrevious()) {
		System.out.println(listIterator1.previous());
	}
	}
	}
}


