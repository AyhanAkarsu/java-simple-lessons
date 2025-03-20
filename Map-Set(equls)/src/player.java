import java.util.Objects;

public class player {
private String isimString;
private int ID;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getIsimString() {
	return isimString;
}
public player(String isimString, int iD) {
	this.isimString = isimString;
	this.ID = iD;
}
public void setIsimString(String isimString) {
	this.isimString = isimString;
}
@Override
public String toString() {
	return "isim: " + getIsimString() + "-ID: " + getID(); 
}
@Override
public int hashCode() {
	return Objects.hash(ID, isimString);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	player other = (player) obj;
	return ID == other.ID && Objects.equals(isimString, other.isimString);
}
}
