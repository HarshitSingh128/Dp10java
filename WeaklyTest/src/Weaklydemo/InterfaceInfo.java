package Weaklydemo;
interface Flyable{
void fly_obj();
}
class Spacecraft implements Flyable{
public void fly_obj(){
System.out.println("In spacecreaft body");
}
}

class Airplane implements Flyable{
public void fly_obj(){
System.out.println("In Airplane body");
}
}
class Helicopter implements Flyable{
public void fly_obj(){
System.out.println("In Helicopter Body");
}
}

public class InterfaceInfo {

	public static void main(String[] args) {
		Spacecraft s1=new Spacecraft();
		s1.fly_obj();
		Airplane a1=new Airplane();
		a1.fly_obj();
		Helicopter h1=new Helicopter();
		h1.fly_obj();
		// TODO Auto-generated method stub

	}

}
