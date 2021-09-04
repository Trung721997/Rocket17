package Entity2;

public abstract class Que2_Student {
	private final int id = 0;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public Que2_Student(String name) {
		this.name = name;
	}

	public static final void study() {
		System.out.println("Đang học bài cấm làm phiền");
	}
	
	@Override
	public String toString() {
		return "ID: " + id + "\n" + "Tên: " + name;
	}

}
