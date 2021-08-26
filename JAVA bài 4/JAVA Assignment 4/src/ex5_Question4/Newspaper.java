package ex5_Question4;

public class Newspaper extends ThuVien{
	private int releaseDate;

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Newspaper(int mtl, String nameSupplier, int releaseNumber, int releaseDate) {
		super(mtl, nameSupplier, releaseNumber);
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return super.toString() + "Ngày phát hành: " + releaseDate;
	}
}
