package dene;
class hayvan {
	private String isim;
	
	public hayvan(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String konus() {
		return "Hayvan konusuyor...";
	}
	
}
class kopek extends hayvan{
	public kopek(String isim) {
		super(isim);

	}

	@Override
	public String konus() {
		
		return this.getIsim()+" havliyor...";
	}
	
}

class aslan extends hayvan{

	public aslan(String isim) {
		super(isim);
	}

	@Override
	public String konus() {
		return this.getIsim()+" Kukruyor...";
	}
	
}

public class main {
	public static void konustur(hayvan Hayvan) {
		System.out.println(Hayvan.konus());
		
	}

	public static void main(String[] args) {
		/*hayvan Hayvan = new hayvan("");
		System.out.println(Hayvan.konus());
		hayvan kedi = new kopek("tekil");
		System.out.println(kedi.konus());
		hayvan aslan = new aslan("Ayhan");
		System.out.println(aslan.konus());*/
		konustur(new kopek("comar"));
		konustur(new aslan("Lio"));
	

	}

}
