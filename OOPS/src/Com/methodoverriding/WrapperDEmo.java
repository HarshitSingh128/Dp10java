package Com.methodoverriding;

public class WrapperDEmo {

	public static void main(String[] args) {
		//Boxing :primitive to wrapper
		int num=23;
		Integer i1= Integer.valueOf(num);
		Integer i3=num;//value od _added by compiler
		System.out.println(i1);
		System.out.println(i3);
		//unboxing
		//wrapper to primitive;
		Float f1=8.45f;
		float f=f1.floatValue();
		float f2=f1;//floatvalue is added by compiler
		System.out.println(f);
		System.out.println(f2);
	

	}

}
