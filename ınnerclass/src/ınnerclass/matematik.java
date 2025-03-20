package ınnerclass;

import java.awt.geom.PathIterator;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class matematik {
	
private double PI = Math.PI;

public class faktoriyel {
	
	public void fak() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Faktoriyeri alinacak sayiyi giriniz..");
		int sayi = scanner.nextInt();
		scanner.nextLine();
		int tut = 1;
	for(int i=1;i<=sayi;i++) {
		tut *= i;
	}
	System.out.println("Girilen sayinin faktoriyeri: "+tut);
}
}

public class Asalmi{
	
	public boolean asalmi(int sayi) {
		for(int i=2;i<sayi;i++) {
			if(sayi%i==0) {
				return false;
			}
		}
		return true;
	}
}
public class alan{
	private float yaricap;
	private int kenar;
	
	
	
	public alan() {
	}

	public void setYaricap(float yaricap) {
		this.yaricap = yaricap;
	}

	public void setKenar(int kenar) {
		this.kenar = kenar;
	}

	public class daire{
		
		public void dairealan(float yaricap) {
			System.out.println("Dairenin alani:"+yaricap*yaricap*PI);
		}
	}
	public class kare{
		public void karealan(int kenar) {
			System.out.println("Karenin alani: "+kenar*kenar);
		}
	}
}
}

