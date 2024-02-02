package Com.abstractdemo;

abstract class Language {
	// can have both abstract and concrete methods
	abstract void details();

	void show() {
		System.out.println("Languages");
	}
}

class ProgLanguage extends Language {

	@Override
	void details() {
		System.out.println("c++,java,.net,python:");

	}

	void display(String name) {
		System.out.println("Institute:" + name);

	}

}

class SpeakingLanguage extends Language {

	@Override
	void details() {
		System.out.println("English ,French,spanish");
  }
	}

public class Abstractdemo1 {
    public static void main(String[] args) {
    	//we cannot ceate object of abstract class
    	//Language l1=new Language();
    	Language lang;
    	lang=new ProgLanguage();
    	lang.details();
    	//lang.display("pooja");
    	lang=new SpeakingLanguage();
    	lang.details();
    	ProgLanguage p1=new ProgLanguage();
    	p1.display("harshit");

	}

}
