package Com.containment;

public class Author {
	private int authrid;
	private String authrname;
   Author(int authrid,String authrname){
	   this.authrid=authrid;
	   this.authrname=authrname;
   }
   public void setAuthorid(int authrid) {
	   this.authrid=authrid;
   }
   public int getAuthorid() {
	   return authrid;
   }
   public void setAuthorName(String authrname) {
	   this.authrname=authrname;
   }
   public String getAuthorName() {
	   return authrname;
	   
   }
   public String toString() {
	   return "Author:"+authrid+" "+authrname;
   }
}
