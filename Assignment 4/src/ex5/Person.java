package ex5;

public abstract class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Name: " + name;
	}

}
