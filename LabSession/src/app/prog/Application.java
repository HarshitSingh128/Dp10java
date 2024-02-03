package app.prog;

public class Application {
	protected double appversion;
	protected int ramcapcity;

	Application() {

	}

	Application(double appversion, int ramcapcity) {
		this.appversion = appversion;
		this.ramcapcity = ramcapcity;
	}

	public String toString() {
		return "Application:" + appversion + " " + ramcapcity;
	}
}
