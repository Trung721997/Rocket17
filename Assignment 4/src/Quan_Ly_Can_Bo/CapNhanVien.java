package Quan_Ly_Can_Bo;

public class CapNhanVien extends Can_Bo {
	private CongViec congViec;
	public enum CongViec {
		HANDIEN, DIEUKHIENMAY, CAPDO, DONVESINH
	}

	public CapNhanVien(String fullName, int age, Gioi_Tinh goithinh, String diaChi, CongViec congViec) {
		super(fullName, age, goithinh, diaChi);
		this.congViec = congViec;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + "Công Việc: " + congViec;
	}

}
