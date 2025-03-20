import java.util.regex.Matcher;

public class daire extends sekilabstract {
private int yaricap;
	public daire(String isim,int yaricap) {
		super(isim);
		this.yaricap = yaricap;
		
	}

	@Override
	void alanhesapla() {
		System.out.println(getIsim()+"Dairenin alani: "+Math.PI*yaricap*yaricap);
	}

}
