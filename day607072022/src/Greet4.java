public class Greet4 {
	public void display() {
		System.out.println("Hello Friends");
	}

	public static void main(String args[]) {
		Greet4 greet = new Greet4();
		greet.display();
		// Cannot make a static reference to the non-static method display() from the
		// type Greet3
	}
}