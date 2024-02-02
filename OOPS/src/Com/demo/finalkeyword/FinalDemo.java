package Com.demo.finalkeyword;
//final :restict the user
//variable ,method and class 
//final and static :while declaration or static block :common for all object
//final and instance:constructor (in all),instance,seprate for all objectes
//fianal
class Developer{
	int id;
	String name;
	//final static int noofHours=8;
	final static int noofHours;
	final String panNo;
	static {
		noofHours=8;
		
	}
	{
		//panNo="NotDefined";
	}
	public Developer() {
		//noofHours=8;
		
		this.panNo="Unknown";
		
	}
	public Developer(int id,String name,String panNo) {
		
		this.id=id;
		this.name=name;
		this.panNo=panNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getNoofhours() {
		return noofHours;
	}
	public String getPanNo() {
		return panNo;
	}
	final void basicSkills() {
		System.out.println("Html,CSS,C,C++,Java");
	}
	public String toString() {
		return ""+id+name+getNoofhours()+getPanNo();
	}
	
}
class FullStackDeveloper extends Developer{
//	void  basicSkills() {
//		System.out.println("Html,CSS,C,C++,JAVA");
//	}
//	we cannot accces final method in other class
}

public class FinalDemo {

	public static void main(String[] args) {
		Developer d1=new Developer(101,"Pravin","JkA8954698K");
		System.out.println(d1);
		//d1.panNo="kahsb";
		d1.name="Harshit";
		System.out.println(d1.name);

	}

}
