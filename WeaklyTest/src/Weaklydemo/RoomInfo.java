package Weaklydemo;

class Room {
	int roomno;
	String roomType;
	double roomarea;
	String acmachine;
	int bedroomqty;
	int bathroomNo;
	

	public Room(int roomno, String roomType, double roomarea, String acmachine) {
		super();
		this.roomno = roomno;
		this.roomType = roomType;
		this.roomarea = roomarea;
		this.acmachine = acmachine;
	}

	public Room() {

	}

	public void DisplayData() {
		System.out.println("We have a Lot variety in room");
		System.out.println("RoomNo :" + roomno);
		System.out.println("RoomType:" + roomType);
		System.out.println("RoomArea:" + roomarea);
		System.out.println("ACMachine:" + acmachine);
	}

}

class DeluxeRoom extends Room {
	public DeluxeRoom(int roomno, String roomType, double roomarea, String acmachine, int bedroomqty) {
		super(roomno, roomType, roomarea, acmachine);
		this.bedroomqty = bedroomqty;

	}

	public DeluxeRoom() {

	}

	public void DisplayData() {
		System.out.println("We have DeluxeRoom");
		System.out.println("RoomNo :" + roomno);
		System.out.println("RoomType:" + roomType);
		System.out.println("RoomArea:" + roomarea);
		System.out.println("ACMachine:" + acmachine);
		System.out.println("Bedroom Quantity is :" + bedroomqty);
	}
}

class Basicroom extends Room {

	public Basicroom(int roomno, String roomType, double roomarea, String acmachine) {
		super(roomno, roomType, roomarea, acmachine);

	}

	public Basicroom() {

	}

	public void DisplayData() {
		System.out.println("We have Basic Room");
		System.out.println("RoomNo :" + roomno);
		System.out.println("RoomType:" + roomType);
		System.out.println("RoomArea:" + roomarea);
		System.out.println("ACMachine:" + acmachine);
	}
}

class SuperDeluxeRoom extends Room {
	public SuperDeluxeRoom(int roomno, String roomType, double roomarea, String acmachine,int bathroomNo) {
		super(roomno, roomType, roomarea, acmachine);
		this.bathroomNo=bathroomNo;

	}

	public SuperDeluxeRoom() {

	}

	public void DisplayData() {
		System.out.println("We have superDeluxeRoom");
		System.out.println("RoomNo :" + roomno);
		System.out.println("RoomType:" + roomType);
		System.out.println("RoomArea:" + roomarea);
		System.out.println("ACMachine:" + acmachine);
		System.out.println("Bathroom Quantity is:" + bathroomNo);
	}
}

public class RoomInfo {

	public static void main(String[] args) {
		Room r;
		r = new Room(101, "Single", 250, "Yes");
		r.DisplayData();
		r = new DeluxeRoom(102, "single", 245, "yes", 2);

		r.DisplayData();
		r = new Basicroom(103, "Single", 145, "Yes");
		r.DisplayData();
		 r = new SuperDeluxeRoom(104, "double", 254, "yes", 2);
		
		r.DisplayData();

	}

}
