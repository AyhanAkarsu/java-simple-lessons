
public class kare extends sekilabstract {
private int kenar;
	public kare(String isim,int kenar) {
		super(isim);
		this.kenar = kenar;
		// TODO Auto-generated constructor stub
	}

	@Override
	void alanhesapla() {
		System.out.println(getIsim()+"Karenin alan hesabi: "+kenar*kenar);
		
	}

}
