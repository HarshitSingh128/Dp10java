package app.prog;

public class DesktopApplication {
	protected int size;
	String color;
	Application application;
	DesktopApplication(){
		
	}
	DesktopApplication(int size,String color,Application application){
		this.size=size;
		this.color=color;
		this.application=application;
		
	}
	public String toString() {
		return "Desktopapplication:"+size+" "+color+" "+application;
	}

}
