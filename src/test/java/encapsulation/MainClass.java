package encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Employee e = new Employee("aadhi", "cs", 23, 10000);
		Employee e1 = new Employee("name1", "EEE", 23, 10000);
		System.out.println(e.getName() + e.getAge());
		System.out.println(e1.getName() + e1.getAge());

	}

}
