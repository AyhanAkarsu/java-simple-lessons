import java.io.Serializable;

public class OBilgi implements Serializable {
private String isim;
private transient int no;
private String bolum;
public OBilgi(String isim, int no, String bolum) {
	this.isim = isim;
	this.no = no;
	this.bolum = bolum;
}
@Override
public String toString() {
	String yazdir = "Isim: "+ isim+"\nNo: " + no + "\nBolum: " + bolum;
	return yazdir;
}
}
