import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterable implements Iterable<String>{
	private class MyIterator implements Iterator<String>{
private int indeks = 0;
		@Override
		public boolean hasNext() {
			if(indeks < liste.size()) {
				return true;
			}
			else {
				return false;
			}
		}

		@Override
		public String next() {
			String tut = liste.get(indeks);
			indeks ++;
			return tut;
		}
		
	}
	private List<String> liste = new ArrayList<>();
	
	public MyIterable(String[] strings) {
		for (String string : strings) {
			liste.add(string);
		}
	}

	@Override
	public Iterator<String> iterator() {
		// return liste.iterator();
		return new MyIterator();
	}



	

}
