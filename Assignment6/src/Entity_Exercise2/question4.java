package Entity_Exercise2;

public class question4 {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public question4() {}

	public question4(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void getIndex(int index) {
		question4 deparment = new question4(1, "sale");
		question4 deparment1 = new question4(2, "sale1");
		question4 deparment2 = new question4(3, "sale2");
		question4[] dep = {deparment, deparment1, deparment2};
		try {
			question4 que = dep[index];
			System.out.println("Thông tin deparment: " + que);
		}catch (Exception e) {
			System.out.println("Cannot find department");
		}	
		}


	@Override
	public String toString() {
		return "question4{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
