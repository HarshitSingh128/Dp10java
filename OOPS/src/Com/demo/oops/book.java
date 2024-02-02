package Com.demo.oops;

public class book {
	int bookid;
	String bookname;
	double bookprice;
	public void readbook() {
		System.out.println("read book instance variable");
	}

	public static void main(String[] args) {
		System.out.println(new book().bookid );
		System.out.println(new book().bookname );
		System.out.println(new book().bookprice);
		book b1=new book();
		System.out.println(b1.bookid);
		System.out.println(b1.bookname);
		System.out.println(b1.bookprice);
		b1.readbook();
		
	}

}
