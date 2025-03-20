import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.midi.Soundbank;

public class main {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		Set<String> set3 = new TreeSet<String>();
		set1.add("Java");
		set1.add("Python");
		set1.add("C");
		set1.add("C++");
		set1.add("R");
		
		set2.add("Java");
		set2.add("Matlap");
		set2.add("C#");
		set2.add("C++");
		
		
		set3.add("Javascript");
		set3.add("Python");
		set3.add("TIA portal");
		set3.add("PHP");
		System.out.println("****Hashset****");
		for (String string1 : set1) {
			System.out.println(string1);
			
		}
		System.out.println("*****LinkedHashSet***");
		for (String string2 : set2) {
			System.out.println(string2);
			
		}
		System.out.println("****TreeSet****");
		for (String string3 : set3) {
			System.out.println(string3);
		}	
		
		Set<String>	set4 = new HashSet<String>();
		set4.add("C");
		set4.add("Python");
		Set<String> fark = new HashSet<String>(set1);
		System.out.println(fark.retainAll(set1));
		System.out.println(fark);
		System.out.println(fark.removeAll(set1));
			
		
		
		
		

	}

}
