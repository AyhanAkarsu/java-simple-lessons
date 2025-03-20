package deneme;

public class Pc {
	private kasa Kasa;
	private anakart Anakart;
	private monitor Monitor;

public Pc(kasa Kasa,anakart Anakart,monitor Monitor) {
	this.Anakart = Anakart;
	this.Kasa = Kasa;
	this.Monitor = Monitor;
}

public kasa getKasa() {
	return Kasa;
}

public void setKasa(kasa kasa) {
	Kasa = kasa;
}

public anakart getAnakart() {
	return Anakart;
}

public void setAnakart(anakart anakart) {
	Anakart = anakart;
}

public monitor getMonitor() {
	return Monitor;
}

public void setMonitor(monitor monitor) {
	Monitor = monitor;
}
	
	
}
