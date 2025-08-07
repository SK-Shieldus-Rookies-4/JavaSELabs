package workshop.oop.flexible;

public class Employee extends Object {

	private String name;
	protected double salary;

	public Employee() {
//		super(); //Object 꺼를 부르는 것 
	}
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
	    return this.name;
	}

	public double getSalary() {
	    return this.salary;
	}

}