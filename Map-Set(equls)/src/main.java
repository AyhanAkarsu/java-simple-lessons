import java.security.PublicKey;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		Set<player> sett = new HashSet<player>();
		player goster = new player("Ali",1);
		player goster2 = new player("Veli",2);
		player goster3 = new player("Ali",1);
		
		sett.add(goster);
		sett.add(goster2);
		sett.add(goster3);
		
		for (player player : sett) {
		System.out.println(player);	
		}
	}
}
