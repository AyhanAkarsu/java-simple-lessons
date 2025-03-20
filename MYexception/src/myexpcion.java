
public class myexpcion extends IndexOutOfBoundsException{
public myexpcion(String message) {
	super(message);
}

@Override
public void printStackTrace() {
	System.out.println("my error.");
}
}
