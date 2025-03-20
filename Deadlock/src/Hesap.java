
public class Hesap {
private int bakiye = 10000;

public void yatir(int mikmar)
{
	bakiye += mikmar;
}
public void gonder(int gonder)
{
	bakiye -= gonder;
}
public void hesaptangonder(Hesap hesap1, Hesap hesap2, int miktar)
{
	hesap1.gonder(miktar);
	hesap2.yatir(miktar);
}
public int getbakiye()
{
	return bakiye;
}
}
