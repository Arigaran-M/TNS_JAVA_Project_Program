package com.tnsif.encapsulation.student;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		s1.setSid("421121104001");
		s1.setSname("Abu");
		s1.setDept("Bachelor of Engineering in the Stream of Electronic and Communication");
		s1.setSec('A');
		s1.setMobno("+91 9943312209");
		
		s2.setSid("421121104004");
		s2.setSname("Alwin");
		s2.setDept("Bachelor of Engineering in the Stream of Electronic and Communication");
		s2.setSec('A');
		s2.setMobno("+91 9600250499");
		
		s3.setSid("421121104005");
		s3.setSname("Ari");
		s3.setDept("Bachelor of Engineering in the Stream of Electronic and Communication");
		s3.setSec('A');
		s3.setMobno("+91 9345844240");
		
		s4.setSid("421121104029");
		s4.setSname("Jothi");
		s4.setDept("Bachelor of Engineering in the Stream of Electronic and Communication");
		s4.setSec('A');
		s4.setMobno("+91 9659635599");
		
		s5.setSid("421121104004");
		s5.setSname("Alwin");
		s5.setDept("Bachelor of Engineering in the Stream of Electronic and Communication");
		s5.setSec('A');
		s5.setMobno("+91 6382767427");
		
		System.out.println("Student Reg. No.: "+s1.getSid()+"\nStudent Name: "+s1.getSname()+"\nStudent Department: "+s1.getDept()+"\nStudent Section: "+s1.getSec()+"\nStudent Mobil No.: "+s1.getMobno());
		System.out.println("\nStudent Reg. No.: "+s2.getSid()+"\nStudent Name: "+s2.getSname()+"\nStudent Department: "+s2.getDept()+"\nStudent Section: "+s2.getSec()+"\nStudent Mobil No.: "+s2.getMobno());
		System.out.println("\nStudent Reg. No.: "+s3.getSid()+"\nStudent Name: "+s3.getSname()+"\nStudent Department: "+s3.getDept()+"\nStudent Section: "+s3.getSec()+"\nStudent Mobil No.: "+s3.getMobno());
		System.out.println("\nStudent Reg. No.: "+s4.getSid()+"\nStudent Name: "+s4.getSname()+"\nStudent Department: "+s4.getDept()+"\nStudent Section: "+s4.getSec()+"\nStudent Mobil No.: "+s4.getMobno());
		System.out.println("\nStudent Reg. No.: "+s5.getSid()+"\nStudent Name: "+s5.getSname()+"\nStudent Department: "+s5.getDept()+"\nStudent Section: "+s5.getSec()+"\nStudent Mobil No.: "+s5.getMobno());
	}

}
