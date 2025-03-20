
public class isim {
private String ad;

@Override
public String toString() {
	return "isim: "+ad;
}

public isim(String ad) {
	this.ad = ad;
}

public String getAd() {
	return ad;
}

public void setAd(String ad) {
	this.ad = ad;
}
}
