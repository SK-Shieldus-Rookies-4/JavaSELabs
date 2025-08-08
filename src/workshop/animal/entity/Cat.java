package workshop.animal.entity;

public class Cat extends Animal implements Pet {
	
	private String name;
	
	//현재는 부모의 기본 생성자가 없음 
	public Cat(String name) {
		super(4);  // 부모호출하는건 앞에 this정의한거보다 앞에 와야함 
		this.name = name;
	}
	
	public Cat() {
		//super(4);
		this(""); // 위 생성자 부름 
		
	}
	
	//부모의 기본생성자가 있다면 자동으로 만들어줌 
//	public Cat() {
//		super();
//	}
	

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("고양이는 장화를 신고 놀아요!");
	}

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹어요!");
	}
	
	
}
