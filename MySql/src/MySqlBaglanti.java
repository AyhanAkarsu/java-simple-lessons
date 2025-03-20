import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.conf.HostInfo;
import com.mysql.cj.xdevapi.Statement;

public class MySqlBaglanti {
private String Ad = "root";
private String sifre = "";
private String host = "localhost";
private String db_ismi = "dene";
private int port = 3306;
private Connection con = null;
public MySqlBaglanti()
{
	String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, Ad, sifre);
		System.out.println("Baglanti basarili");
	}
	catch(ClassNotFoundException ex){
		System.out.println("Driver bulunamadi");
	}
	catch (SQLException e) {
		System.out.println("Baglanti basarisiz");
	}
}
public void verigetir() throws SQLException
{
	java.sql.Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("Select * From denemeler");
	while(rs.next())
	{
		System.out.println(rs.getInt("ID")+ " " + rs.getString("AD") + " " + rs.getString("SOYAD"));
	}
	con.close();
}
public static void main(String[] args) throws SQLException
{
	MySqlBaglanti mySqlBaglanti = new MySqlBaglanti();
	mySqlBaglanti.verigetir();
	
}
}
