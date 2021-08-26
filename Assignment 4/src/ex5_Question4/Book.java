package ex5_Question4;

public class Book extends ThuVien {
	private String author;
	private int numberOfPages;


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getNumberOfPages() {
		return numberOfPages;
	}


	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	public Book(int mtl, String nameSupplier, int releaseNumber, String author, int numberOfPages) {
		super(mtl, nameSupplier, releaseNumber);
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Tên tác giả: " + author + "\n" 
				+"Số trang: " + numberOfPages;
	}
}
