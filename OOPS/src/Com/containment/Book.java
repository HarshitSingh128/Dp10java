package Com.containment;

public class Book {
	private int bkid;
	private String bkname;
	private Author author;
    
	Book(int bkid,String bkname,Author author){
		this.bkid=bkid;
		this.bkname=bkname;
		this.author=author;
	}
	public void setBookid(int bkid) {
		this.bkid=bkid;
	}
	public int getBookid() {
		return bkid;
		
	}
	public void setBookname(String bkname) {
		this.bkname=bkname;
	}
	public String getBookname() {
		return bkname;
		
	}
	public void setAuthor(Author author) {
		this.author=author;
	}
	public Author getAuthor() {
		return author;
	}
	public String toString() {
		return "Book:"+bkid+ " "+bkname+ ""+author;
	}
}
