package Weaklydemo;


		class Address{
			private String city,state,country;
			Address(){
			}
			Address(String city,String state,String country){
			this.city=city;
			this.state=state;
			this.country=country;
			}
			public void setCity(String city){
			this.city=city;
			}
			public String getCity(){
			return city;
			}
			public void setState(String state){
			this.state=state;
			}
			public String getState(){
			return state;
			}
			public void setCountry(String country){
			this.country=country;
			}
			public String getCountry(){
			return country;
			}
			public  String toString(){
			return "Adderess:"+city+" "+state+" "+country;
			}
			}
			class Person{
			private String name,gender;
			private int age;
			private Address address;
			Person(){
			}
			Person(String name,String gender,int age,Address address){
			this.name=name;
			this.gender=gender;
			this.age=age;
			this.address=address;
			}
			public void setName(String name){
			this.name=name;
			}
			public String getName(){
			return name;
			}
			public void setGender(String gender){
			this.gender=gender;
			}
			public String getGender(){
			return gender;
			}
			public void setAge(int age){
			this.age=age;
			}
			public int getAge(){
			return age;
			}
			public void setAddress(Address address){
			this.address=address;
			}
			public Address getAddress(){
			return address;
			}
			public String toString(){
			return "Person:"+name+" "+gender+" "+age+" "+address;
			}
			}
			public class PersonalInfo{
			public static void main(String args[]){
			Person p1=new Person("pooja","male",25,new Address("jaunpur","up","India"));
			System.out.println(p1);
			}
			
	}


