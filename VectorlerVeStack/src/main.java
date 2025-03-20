import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class main {

	public static void main(String[] args) {
		Vector<String> vektorler = new Vector<String>();
		vektorler.add("B");
		vektorler.add("a");
		vektorler.add("D");
		vektorler.add("Bssaf");
		ListIterator<String> sirala = vektorler.listIterator();
		while(sirala.hasNext()) {
			System.out.println(sirala.next());
		}
		System.out.println("*********************");
		Enumeration<String> sirala2 = vektorler.elements();
		while (sirala2.hasMoreElements()) {
			System.out.println(sirala2.nextElement());
		}
		System.out.println("*****************************");
		Stack<Character> stckCharacter = new Stack<Character>();
		stckCharacter.push('s');
		stckCharacter.push('x');
		stckCharacter.push('q');
		ListIterator<Character> sirala3 = stckCharacter.listIterator();
		while (sirala3.hasNext()) {
			System.out.println(sirala3.next());
		}
		System.out.println("************************");
		Enumeration<Character> sirala4 = stckCharacter.elements();
		while(sirala4.hasMoreElements()) {
			System.out.println(sirala4.nextElement());
		}
	}

}
