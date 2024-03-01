package com.demo.arrayobject;

public class Studentarray {
	static void displayAllStudents(Student st[]) {
		for(Student s:st) {
			System.out.println(s);
		}
	}
	static void sortMarks(Student st[] ) {
		Student stemp=new Student();
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].getMarks()>st[j].getMarks()) {
					stemp=st[i];
					st[i]=st[j];
					st[j]=stemp;;
					
				}
			}
		}
	}

	public static void main(String[] args) {
		//Student s=new Student();
		Student stud[]=new Student[5];
		//System.out.println(stud[1].getNmae());
		//using constructor
		stud[0]=new Student(101,"pradnya",89);
		//stud[1]=new Student();
		stud[1]=new Student(102,"amurta",78);
		stud[2]=new Student(103,"amu",75);
		stud[3]=new Student(104,"gunjan",96);
		stud[4]=new Student(105,"Aksta",87);
		
		//System.out.println(stud[1].getNmae());
		System.out.println("__________________________");
		displayAllStudents(stud);
		System.out.println("================================");
		
		
		sortMarks(stud);
		System.out.println("=======================");
		displayAllStudents(stud);
		
	

	}

}
