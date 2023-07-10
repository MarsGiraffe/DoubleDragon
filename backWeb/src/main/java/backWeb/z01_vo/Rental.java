package backWeb.z01_vo;

public class Rental {
	private String title;
	private String writer;
	private String publisher;
	public Rental() {
		// TODO Auto-generated constructor stub
	}
	public Rental(String title, String writer, String publisher) {
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
}
