package Quan_Ly_Can_Bo;

public class CapKySu extends Can_Bo {
	private NganhDaoTao nghanhDaoTao;
	public enum NganhDaoTao {
		KYSUDIEN, IT, TUDONGHOA, DIENDIENTU
	}
	
	public CapKySu(String fullName, int age, Gioi_Tinh goithinh, String diaChi, 
			NganhDaoTao nghanhDaoTao) {
		super(fullName, age, goithinh, diaChi);
		this.nghanhDaoTao =  nghanhDaoTao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + "Nghành đào tạo: " + nghanhDaoTao;
	}
}
