package sil;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class df {
public static void sirala(LinkedList<String> sira,String yeni) {
	ListIterator<String> iterator = sira.listIterator();
	while(iterator.hasNext()) {
		int karsilastir = iterator.next().compareTo(yeni);
		if(karsilastir == 0) {
			System.out.println("Zaten listede var");
			return;
		}
		else if(karsilastir < 0) {
			
		}
		else if(karsilastir > 0) {
			iterator.previous();
			iterator.add(yeni);
			return;
		} 
	}
	iterator.add(yeni);
} 
public static void g(LinkedList<String> ll) {
ListIterator<String> iterator	=  ll.listIterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}
	}

	
	

	public static void main(String[] args) {
	LinkedList<String> l = new LinkedList<>();
	l.add("dsf");
	l.add("dssvf");
	l.add("dsfsdsf");
sirala(l,"sdda");
sirala(l,"z");
sirala(l,"asdfg");
g(l);

	}

}
