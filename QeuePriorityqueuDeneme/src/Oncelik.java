
public class Oncelik implements Comparable<Oncelik> {
	private String hasta_isim;
	private String hastalik;
	private int oncelik;
	public String getHasta_isim() {
		return hasta_isim;
	}
	public String getHastalikString() {
		return hastalik;
	}
	public int getOncelik() {
		return oncelik;
	}
	public Oncelik(String hasta_isim, String hastalik) {
		this.hasta_isim = hasta_isim;
		this.hastalik = hastalik;
		if(hastalik.equals("Agir yaralanma")) {
			oncelik = 1;
		}
		else if(hastalik.equals("Yaralanma")) {
			oncelik = 2;
		}
		else {
			oncelik = 3;
		}
	}
	@Override
	public String toString() {
		return "Oncelikli hasta: " + hasta_isim + "\nHastalik: " + hastalik + "\nOncelik: " + oncelik;
	}
	@Override
	public int compareTo(Oncelik o) {
		if(this.oncelik > o.oncelik) {
			return 1;
		}
		else if(this.oncelik < o.oncelik) {
			return -1;
		}
		return 0;
	}
}
