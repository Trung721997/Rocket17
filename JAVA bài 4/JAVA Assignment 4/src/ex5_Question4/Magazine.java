package ex5_Question4;

public class Magazine extends ThuVien {
	private	int issueNumber;
	private int releaseMonth;

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	public int getReleaseMonth() {
		return releaseMonth;
	}

	public void setReleaseMonth(int releaseMonth) {
		this.releaseMonth = releaseMonth;
	}
	public Magazine(int mtl, String nameSupplier, int releaseNumber, int issueNumber, int releaseMonth) {
		super(mtl, nameSupplier, releaseNumber);
		this.issueNumber = issueNumber;
		this.releaseMonth = releaseMonth;
	}


	
	@Override
	public String toString() {
		return super.toString() + "Số phát hành: " + issueNumber + "\n"
				+ "Tháng phát hành: " + releaseMonth;
	}
}
