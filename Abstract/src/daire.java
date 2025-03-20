
public class daire extends Sekil {
private int yaricap;

	public daire(String isim,int yaricap) {
	super(isim);
	this.yaricap = yaricap;
}

	@Override
	void alan() {
		System.out.println(getIsim()+" Alani "+(yaricap*yaricap*Math.PI));
	}
}
