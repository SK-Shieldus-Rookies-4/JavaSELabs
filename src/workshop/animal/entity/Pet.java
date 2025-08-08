package workshop.animal.entity;

public interface Pet {
	String getName(); //public abstract생략해도 자동으로 들어와있는 것 
	void setName(String name);
	public abstract void play();
}
