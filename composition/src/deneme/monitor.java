package deneme;

public class monitor {
	private int yil;
	private String monitor;
	private int inch;
	private reserotion Reserotion;
	
	
	
	public monitor(int yil,String monitor,int inch,reserotion Reserotion) {
this.yil = yil;
this.monitor = monitor;
this.inch = inch;
this.Reserotion = Reserotion;
}



	public int getYil() {
		return yil;
	}



	public void setYil(int yil) {
		this.yil = yil;
	}



	public String getMonitor() {
		return monitor;
	}



	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}



	public int getInch() {
		return inch;
	}



	public void setInch(int inch) {
		this.inch = inch;
	}



	public reserotion getReserotion() {
		return Reserotion;
	}
	public void monitorac() {
		System.out.println("monitor aciliyor....");
	}



	public void setReserotion(reserotion reserotion) {
		Reserotion = reserotion;
	}
}
