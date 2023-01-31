package encapsulation;

public class Employee {
	private String name;
	private String dep;
	private int age;
	private long salary;

	public Employee(String name, String dep, int age, long salary) {
		super();
		this.name = name;
		this.dep = dep;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}
