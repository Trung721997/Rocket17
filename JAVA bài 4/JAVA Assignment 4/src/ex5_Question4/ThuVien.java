package ex5_Question4;

public abstract class ThuVien {
	private int mtl;
	private String nameSupplier;
	private int releaseNumber;
	
	public ThuVien(int mtl, String nameSupplier, int releaseNumber) {
		super();
		this.mtl = mtl;
		this.nameSupplier = nameSupplier;
		this.releaseNumber = releaseNumber;
	}
	public int getMtl() {
		return mtl;
	}
	public void setMtl(int mtl) {
		this.mtl = mtl;
	}
	public String getNameSupplier() {
		return nameSupplier;
	}
	public void setNameSupplier(String nameSupplier) {
		this.nameSupplier = nameSupplier;
	}
	public int getReleaseNumber() {
		return releaseNumber;
	}
	public void setReleaseNumber(int releaseNumber) {
		this.releaseNumber = releaseNumber;
	}
	
	
	@Override
	public String toString() {
		return " Mã tài liệu: " + mtl + "\n" + "Tên nhà xuất bản: " 
				+ nameSupplier + "\n" + "Số bản phát hành: " 
				+ releaseNumber + "\n";
	}
}
