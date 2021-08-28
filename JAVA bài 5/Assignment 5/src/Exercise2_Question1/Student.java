package Exercise2_Question1;

public class Student implements IStudent {
	private int i = 1;
	private int id;
	private String name;
	private int group;
	@Override
	public void diemDanh() {
		System.out.println(name + " điểm danh" );	
	}
	
	@Override
	public void hocBai() {
		System.out.println(name + " đang học bài" );
	}
	
	@Override
	public void donVeSinh() {
		System.out.println(name + " đi dọn vệ sinh" );	
	}

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

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}
	
	
	public Student( String name, int group) {
		this.id = i++;
		this.name = name;
		this.group = group;
	}

	@Override
	public String toString() {
		return "ID: " + id + "	|	" + "Name: " + name + "	|	" 
				+ "Group: " + group;
	}
	
}
