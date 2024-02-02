package Com.covarient;

class First {
//	Number value;
//	Number displayvalue() {
//		value=10;
//		return value;
//	}
	Object value;

	Object displayValue() {
		value = 10;
		return value;
	}

}
class Second extends First{
	Integer myVal;
	Integer displayValue() {
	myVal=20;
	return myVal;
	}
}
class Third extends First{
	Character ch;
	Character displayValue() {
		ch='A';
		return ch;
	}
}

public class CovarientWrapperDemo {

	public static void main(String[] args) {
		First f;
		First f1=new First();
		
		System.out.println("Number is:"+f1.displayValue());
		Second s1=new Second();
		System.out.println("Result is:"+(s1.displayValue()+10));

	}
}
