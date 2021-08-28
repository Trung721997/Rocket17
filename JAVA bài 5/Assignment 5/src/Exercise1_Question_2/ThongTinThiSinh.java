package Exercise1_Question_2;

public class ThongTinThiSinh {
	private int sbd;
	private String hoTen;
	private String diaChi;
	private int mucUuTien;
	private TenKhoi tenKhoi;
	private CacMonThi cacMonThi;
	
	public enum TenKhoi {
		A, B, C
	}
	public enum CacMonThi {
		TOAN_LY_HOA, TOAN_HOA_SINH, VAN_SU_DIA
	}
	

	public ThongTinThiSinh(int sbd, String hoTen, String diaChi, int mucUuTien,
			TenKhoi tenKhoi, CacMonThi cacMonThi) {
		this.sbd = sbd;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.tenKhoi = tenKhoi;
		this.cacMonThi = cacMonThi;
	}
	

	public int getSbd() {
		return sbd;
	}

	public void setSbd(int sbd) {
		this.sbd = sbd;
	}

	
	@Override
	public String toString() {
		return "Số báo danh: " + sbd + "\n" + "Họ tên: " + 
				hoTen + "\n" + "Địa chỉ: " + diaChi + "\n" + "Mức ưu tiên: " + 
				mucUuTien + "\n" + "Tên khối thi: " + tenKhoi + "\n" + "Các môn thi: " 
				+ cacMonThi;
	}


	

}
