package interfaceyurtdisizni;

public class main {

	public static void main(String[] args) {
		yolcu Yolcu = new yolcu();
		int durum = 1;
		while(durum == 1) {
			if(Yolcu.yurtdisiharc() == false) {
				durum = 0;
				continue;
			}
			if(Yolcu.siyasiyasak() == false) {
				durum = 0;
				continue;
			}
			if(Yolcu.vizedurumu() == false) {
				durum = 0;
				continue;
			}
		}

	}

}
