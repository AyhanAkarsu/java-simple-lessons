package sil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
class player implements Comparable<player>{
	private String isim;
	private int ID;
	public String getIsim() {
		return isim;
	}
	@Override
	public String toString() {
		return "Isim: "+isim + " ID :"+ ID;
	}
	public int getID() {
		return ID;
	}
	public player(String isim, int iD) {
		this.isim = isim;
		ID = iD;
	}
	@Override
	public int compareTo(player o) {
		if(this.ID < o.ID) {
			return -1;
		}
		else if(this.ID > o.ID) {
			return 1;
		}
		return 0;
	}
	
}
public class main {

	public static void main(String[] args) {
	/*	List<Character> sirala = new ArrayList<Character>();
		sirala.add('z');
		sirala.add('a');
		sirala.add('g');
		sirala.add('b');
		Collections.sort(sirala);
	for (Character character : sirala) {
		System.out.println(character);
		} */
	List<player> listele = new ArrayList<player>();
	listele.add(new player("A", 0));
	listele.add(new player("Z", 8));
	listele.add(new player("S", 2));
	listele.add(new player("T", 1));
	Collections.sort(listele);
	for (player player : listele) {
		System.out.println(player);
	}
	System.out.println("******************");
	player dene = new player("Z", 9);
	player dene1 = new player("A", 1);
	List<player> deneList = new ArrayList<player>();
	deneList.add(dene);
	deneList.add(dene1);
	System.out.println(dene.compareTo(dene1));
	}
}
