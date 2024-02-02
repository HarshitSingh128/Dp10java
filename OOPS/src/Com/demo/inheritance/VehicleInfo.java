package Com.demo.inheritance;

class Vehicle{
	int vehicleno;
	String vehiclename;
	String vehicleType;
	int vehiclewheels;

	Vehicle() {

	}

	Vehicle(int vehicleno, String vehiclename, String vehicleType, int vehiclewheels) {
		this.vehicleno = vehicleno;
		this.vehiclename = vehiclename;
		this.vehicleType = vehicleType;
		this.vehiclewheels = vehiclewheels;
	}

	public String toString() {
		return "Vehicle:" +vehicleno+ " "+"Name: "+"" + vehiclename +" "+"VehicleType:"+"" + vehicleType + "Vehiclewheels:" +""   + vehiclewheels;
	}

}

class Car extends Vehicle {
	int carmodel;

	Car() {

	}

	Car(int vehicleno, String vehiclename, String vehicleType, int vehiclewheels, int carmodel) {
		super(vehicleno, vehiclename, vehicleType, vehiclewheels);
		this.vehicleType = vehicleType;
		this.carmodel = carmodel;
		this.vehiclewheels = vehiclewheels;
	}

	public String toString() {
		return "Car:" + vehicleno + " " + vehiclename + " " + carmodel + " " + vehicleType + " " + vehiclewheels;
	}

}

public class VehicleInfo {
	public static void main(String[] args) {
		Car c1 = new Car(1021, "Auto", "Roadvehicle", 12, 1212154);
		System.out.println(c1);
		Vehicle v1 = new Vehicle(102, "Maruti", "Roadvehicle", 12);
		System.out.println(v1);

	}
}
