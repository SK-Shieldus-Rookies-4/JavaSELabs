package workshop.oop.flexible;
/* 평사원 클래스 */
public class MereClerk extends Employee {
    public MereClerk (String name, double salary) {
//        this.name = name;
//        this.salary = salary;
    	super(name, salary); //부모의 생성자를 불러줌 
    }
    
    public void manageSalary(double rate) {
        salary = salary+ salary*(rate/100);
    }
}