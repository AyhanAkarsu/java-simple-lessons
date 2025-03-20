import javax.imageio.stream.ImageInputStreamImpl;

public class main {

	public static void main(String[] args) {
		Integer[] sayilar = {1,2,3,4,5};
		Character[] karakter = {'j','a','v','a'};
		String[] strings = {"java"};
		isim[] Isim = {new isim("Ayhan"),new isim("Ace")};
System.out.println("***************");
yazdir_isim.isim_yazdir(Isim);
System.out.println("***************");
yazdir_int.int_dizi(sayilar);
System.out.println("***************");
karakter_yazdir.yazdir_karakter(karakter);
System.out.println("***************");
string_yazdir.yazdir_string(strings);
System.out.println("***************");
	System.out.println("***Generic****");
	genericClass<Integer> i_yazdir = new genericClass<Integer>();
	i_yazdir.yazdir(sayilar);
	System.out.println("*********");
	genericClass<isim> isim_yazdir = new genericClass<isim>();
	isim_yazdir.yazdir(Isim);
	System.out.println("*********");
	genericClass<Character> karakter_yazdir = new genericClass<Character>();
	karakter_yazdir.yazdir(karakter);
	System.out.println("*********");
	genericClass<String> string_yazdir = new genericClass<String>();
	string_yazdir.yazdir(strings);
	System.out.println("*********");	
	bastir(sayilar);
	bastir(karakter);
	bastir(strings);
	bastir(Isim);
	}
	public static<E> void bastir(E[] dizi) {
		for (E e : dizi) {
			System.out.println(e);
		}
	}
}
