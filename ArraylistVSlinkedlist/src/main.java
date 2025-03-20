import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		LinkedList<Integer> liste2 = new LinkedList<Integer>();
		zamanHesap("ArrayList", liste1);
		zamanHesap("LinkedList",liste2);
		

	}
	public static void zamanHesap(String isim, List<Integer> liste) {
		long baslangic;
		long bitis;
		baslangic = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			liste.add(0,i);
		}
		bitis = System.currentTimeMillis();
		System.out.println(isim+" "+(bitis-baslangic)+"ms");
	}
}
