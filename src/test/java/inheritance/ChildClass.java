package inheritance;

public class ChildClass extends ParentClasscar {

	public void seat(int n) {
		System.out.println(n + " seat");
	}

	public void seat(int n, int y) {
		System.out.println(n + " front seat " + y + " foldable seat");
	}
	public void engine() {
		System.out.println("car brand engine");
	}


	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.wheel();
		cc.seat(4);
		cc.seat(4, 3);
		cc.engine();
	}

}
