import java.lang.reflect.Type;

public class toplamaislemi {
public static void sum(String a, String b)
{
  String rem = "";
  int count = 0;
  if(a.length() > b.length())
  {
	  b = "0" + b;
  }
  else if(b.length() > a.length())
  {
	  a = "0" + a;
  }
  System.out.println("Sayi1: " + a + " Sayi2: " + b);
  for(int i = a.length()-1; i >= 0; i--)
  {
	  if(Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + count <= 9)
	  {
		 rem += Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + count;
		 count = 0;
	  }
	  else {
	  {
		  rem += Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + count;
		  count = 1;
	  }
	  }
}
  rem = new StringBuilder(rem).reverse().toString();
  System.out.println(rem);
}
	public static void main(String[] args) {
		sum("12300000000000000000004", "230000000000000000000000");
	}
}
