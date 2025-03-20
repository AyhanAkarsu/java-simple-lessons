import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
class player{
	  private String isim;
	  private int ID;
	public String getIsim() {
		return isim;
	}
	public int getID() {
		return ID;
	}
	
	public player(String isim, int ID) {
		this.isim = isim;
		this.ID = ID;
	}
	@Override
	public String toString() {
		
		return "Isim: " + isim + " ID: " + ID;
	}
}

class BuyuktenKucuge implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return -o1.compareTo(o2);
	}
}
class Kucuktenbuyuge_player implements Comparator<player>{

	@Override
	public int compare(player o1, player o2) {
		if(o1.getID() < o2.getID()) {
			return -1;
		}
		else if(o1.getID() > o2.getID()) {
			return 1;
		}
		return 0;
	}
}
class stringSiralaB_player implements Comparator<player>{

	@Override
	public int compare(player o1, player o2) {
	return o1.getIsim().compareTo(o2.getIsim());
	}
	
}
public class main {
	public static void main(String[] args) {
		
		List<String> sirala = new ArrayList<>();
		sirala.add("Z");
		sirala.add("T");
		sirala.add("V");
		
		Collections.sort(sirala, new BuyuktenKucuge());	
		for (String string : sirala) {
			System.out.println(string);
		}
		System.out.println("***********");
		List<player> sirala2 = new ArrayList<player>();
		sirala2.add(new player("Z", 0));
		sirala2.add(new player("A", 8));
		sirala2.add(new player("C", 2));
		Collections.sort(sirala2, new Kucuktenbuyuge_player());
		for (player player : sirala2) {
			System.out.println(player);
		}
		System.out.println("*******************");
		Collections.sort(sirala2, new stringSiralaB_player());
		for (player player : sirala2) {
			System.out.println(player);
		}
		System.out.println("***********AnonimClass******");
		Collections.sort(sirala2,new Comparator<player>() {

			@Override
			public int compare(player o1, player o2) {
				
				return o1.getIsim().compareTo(o2.getIsim());
			}
		});
		for (player player : sirala2) {
			System.out.println(player);
		}
		Collections.sort(sirala2, new Comparator<player>() {

			@Override
			public int compare(player o1, player o2) {
				if(o1.getID() > o2.getID()) {
					return -1;
				}
				else if(o1.getID() < o2.getID()) {
					return -1;
				}
				return 0;
			}
		});
		System.out.println("*************");
	  for (player player : sirala2) {
		  System.out.println(player);
	}
	}
}
