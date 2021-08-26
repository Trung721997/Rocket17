package ex6_Question1;

public class Contacts {
	private String name;
	private int sdt;
	

	
	public Contacts(String name, int sdt) {
		this.name = name;
		this.sdt = sdt;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSdt() {
		return sdt;
	}



	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	private void remore() {
		// TODO Auto-generated method stub

	}



	@Override
	public String toString() {

		return "Tên của sdt: " + name + "\n" + "Số điện thoại: " + sdt;
	}
	
}
