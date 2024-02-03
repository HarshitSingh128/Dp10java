package app.prog;

public class Developer {
	protected String devName;
	int devexperience;
	String skill;
	Application application;
	Developer(){
		
	}
	public Developer(String devName,int devexperience,String skill,Application application) {
		this.devName=devName;
		this.devexperience=devexperience;
		this.skill=skill;
		this.application=application;
	}
	public void debugApp() {
		System.out.println("In debug app:");
	}
	public void intigrateCode() {
		System.out.println("Intigratedcode");
	}
	public String toString() {
		return "Developer:"+devName+" "+devexperience+" "+skill+" "+application;
		
	}

}
