package Entity;

public class Que1_2_Student implements IQue1_2_Student {
	private int msv ;
	private String name;
	private String nghanhHoc;
	private String khoaHocNam;
	private int tienDongQuyCuaTungHocSinh;
	private static int tienQuyLop;
	private static String college = "Cao đẳng đời";

	public int getTienDongQuyCuaTungHocSinh() {
		return tienDongQuyCuaTungHocSinh;
	}

	public void setTienDongQuyCuaTungHocSinh(int tienDongQuyCuaTungHocSinh) {
		this.tienDongQuyCuaTungHocSinh = tienDongQuyCuaTungHocSinh;
	}

	public int getMsv() {
		return msv;
	}

	public void setMsv(int msv) {
		this.msv = msv;
	}

	public static int getTienQuyLop() {
		return tienQuyLop;
	}

	public static void setTienQuyLop(int tienQuyLop) {
		Que1_2_Student.tienQuyLop = tienQuyLop;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Que1_2_Student.college = college;
	}

	public Que1_2_Student() {}

	public Que1_2_Student(int msv, String name, String nghanhHoc, String khoaHocNam, int tienDongQuyCuaTungHocSinh) {
		this.msv = msv;
		this.name = name;
		this.nghanhHoc = nghanhHoc;
		this.khoaHocNam = khoaHocNam;
		this.tienDongQuyCuaTungHocSinh = tienDongQuyCuaTungHocSinh;
	}

	
	public void tienQuyLop(int tienDongQuyCuaTungHocSinh) {
		this.tienQuyLop += tienDongQuyCuaTungHocSinh;
	}
	
	public void muaBBvaKeo(int soTien) {
		System.out.println("Học sinh đi mua " + soTien + "K" + " bim bim và kẹo");
		this.tienQuyLop -= soTien;
		System.out.println("Tiền quỹ còn lại: " + this.tienQuyLop + "K");
		
	}
	
	public void muaBanhMy(int soTien) {
		System.out.println("Học sinh đi mua " + soTien + "K" + " bánh mỳ");
		this.tienQuyLop -= soTien;
		System.out.println("Tiền quỹ còn lại: " + this.tienQuyLop + "K");
	}
	
	public void muaDoDungHocTap(int soTien) {
		System.out.println("Học sinh đi mua " + soTien + "K" + " đồ dùng học tập");
		this.tienQuyLop -= soTien;
		System.out.println("Tiền quỹ còn lại: " + this.tienQuyLop + "K");
		System.out.println("\n");
	}

	@Override
	public void dongThemTienQuy(int dongTien) {
		this.tienQuyLop += dongTien;
	}

	@Override
	public String toString() {
		return "Que1_2_Student{" +
				"msv=" + msv +
				", name='" + name + '\'' +
				", nghanhHoc='" + nghanhHoc + '\'' +
				", khoaHocNam='" + khoaHocNam + '\'' +
				", tienDongQuyCuaTungHocSinh=" + tienDongQuyCuaTungHocSinh +
				'}';
	}

}
