import java.io.DataOutput;

public class main {

	public static void main(String[] args) {
		String[] denemeliste = {"Asus","MSI","Lenovo","Mcbook","Toshiba"};
		MyIterable myIterable = new MyIterable(denemeliste);
		for (String liste : myIterable) {
			System.out.println(liste);
		}

	}

}
