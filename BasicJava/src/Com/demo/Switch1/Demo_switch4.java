package Com.demo.Switch1;

import java.util.Scanner;

public class Demo_switch4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      String choice;
      System.out.println("welcome to cafe=");
      System.out.println("Tea\ncoffee\ncold drink=");
      System.out.println("Enter choice=");
      choice=sc.next();
      switch(choice) {
      case "tea":
      case "TEA":
      case "Tea":
    	  System.out.println("Tea Rs 30=");
    	  break;
      case "coffee":
      case "COFFEE" :
    	  System.out.println("coffee Rs 100=");
    	  break;
      case "colddrink" :
      case "COLDDRINK" :
    	  System.out.println("cold drink Rs 20=");
    	  break;
    	  default :
    		  System.out.println("Invalid choice=");
      
      }

	}

}
