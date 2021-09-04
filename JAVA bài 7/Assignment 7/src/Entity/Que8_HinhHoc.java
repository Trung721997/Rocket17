package Entity;

public abstract class Que8_HinhHoc {
	private int chieuDai;
	private int chieuRong;
	private int duongCheo;
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	public int getDuongCheo() {
		return duongCheo;
	}
	public void setDuongCheo(int duongCheo) {
		this.duongCheo = duongCheo;
	}
	public Que8_HinhHoc(int chieuDai, int chieuRong, int duongCheo) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
		this.duongCheo = duongCheo;
	}
	
	@Override
	public String toString() {
		return "Chiều dài:" + chieuDai + "\n" + "Chiều rộng: " +  chieuRong + "\n" + "Đường chéo:" + duongCheo ;
	}

}
