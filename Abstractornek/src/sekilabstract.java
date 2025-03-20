import javax.lang.model.element.NestingKind;
import javax.sound.midi.VoiceStatus;

public abstract class sekilabstract {
	private String isim;
	
	public sekilabstract(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	abstract void alanhesapla();
	
	public void isim(String setIsim) {
		System.out.println("Isim: "+setIsim);
	}


}
