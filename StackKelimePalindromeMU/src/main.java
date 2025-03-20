import java.util.Scanner;
import java.util.Stack;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelime giriniz: ");
		String kelime = scanner.nextLine();
		Stack<Character> tut = new Stack<Character>();
		for(int i=0;i<(kelime.length()/2);i++) {
			tut.push(kelime.charAt(i));
		}
			if (palindrome(kelime, tut)) {
				System.out.println("Palindrome kelimedir.");
			} 
			else {
				System.out.println("Palindrome kelime degildir.");
			}	
			
		}

	public static boolean palindrome(String kelime, Stack<Character> tut) {
		for(int i=(kelime.length()/2) + 1;i<kelime.length();i++) {
			if(kelime.charAt(i) == tut.pop()) {
				return true;
			}
		}
		return false;
	}

}
