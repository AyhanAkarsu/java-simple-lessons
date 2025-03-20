import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cumleyi giriniz: ");
		String cumle = scanner.nextLine();
		Map<Character,Integer> sirala = new TreeMap<Character,Integer>();
		
		for(int i=0;i<cumle.length();i++) {
			char tut = cumle.charAt(i);
			
			if(sirala.containsKey(tut)) {
				sirala.replace(tut,sirala.get(tut)+1);
			}
			else {
				sirala.put(tut,1);
			}
		}
	for(Map.Entry<Character,Integer> entry : sirala.entrySet()) {
		System.out.println("Harf: "+entry.getKey()+" Sayi: "+entry.getValue());
	}
	}
}
