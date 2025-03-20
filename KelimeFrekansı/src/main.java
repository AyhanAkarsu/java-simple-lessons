import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.sound.midi.Soundbank;

public class main {

	public static void main(String[] args) {
/*
 * Paragrafı bir diziye ayıralım. 
 * Örneğin, "Bu bir paragraftır. Bu paragraf da bir dizidir.
 * " dizisini ["Bu", "bir", "paragraftır", "Bu", "paragraf", "da", "bir", "dizidir."] 
 * dizisine ayırabiliriz.  Her bir kelime için bir sayaç oluşturalım. 
 * Örneğin, ilk kelime "Bu" olduğu için sayacı bir artıralım.  
 * Diziyi bir döngü ile gezip ve her kelime için sayacı arttıralım. 
 * Örneğin, "Bu" kelimesi dizide 2 kez geçtiği için sayacı 2 arttıralım.  
 * Döngü bittikten sonra, en yüksek sayaç değerine sahip 5 kelimeyi bulup ve 
 * bunları ekrana yazdıralım.  Bu adımları Java dilinde kod olarak yazdığınızda
 *  şu şekilde olabilir:
 */
		    // Paragrafı kullanıcıdan al
		   System.out.println("Lütfen bir paragraf girin: ");
		    Scanner sc = new Scanner(System.in);
		    String paragraph = sc.nextLine();

		    // Kelimeleri ayır
		    String[] words = paragraph.split(" ");

		    // Her kelimeyi bir HashMap içinde tut
		    Map<String, Integer> wordCounts = new TreeMap<>();
		    for (String word : words) {
		      // Her kelimeyi küçük harf yap
		      word = word.toLowerCase();

		      // Eğer kelime daha önceden eklenmemişse, sayacı 1 yap
		      // Aksi halde, sayacı bir arttır
		      if (!wordCounts.containsKey(word)) {
		        wordCounts.put(word, 1);
		      } else {
		        wordCounts.put(word, wordCounts.get(word) + 1);
		      }
		    }
		    for(Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
		    	System.out.println("Kelime: "+entry.getKey() + " Sayi: " + entry.getValue());
		    }
}
}
	


