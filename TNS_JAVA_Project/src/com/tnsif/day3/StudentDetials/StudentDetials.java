package com.tnsif.day3.StudentDetials;

import java.util.*;

public class StudentDetials {
	private String sname;
	private long sroll;
	private char sgrade;
	private	float percentage;
	
	Scanner sn = new Scanner(System.in);
	
	public String getSname() {
		return sname;
	}
	public void setSname() {
		System.out.print("Enter the Student Name: ");
		this.sname = sn.nextLine();
	}
	public long getSroll() {
		return sroll;
	}
	public void setSroll() {
		System.out.print("Enter the Student Roll No.: ");
		this.sroll = sn.nextLong();
	}
	public char getSgrade() {
		return sgrade;
	}
	public void setSgrade() {
		System.out.print("Enter the Student Grade: ");
		this.sgrade = sn.next().charAt(0);
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage() {
		System.out.print("Enter the Student Percentage: ");
		this.percentage = sn.nextFloat();
	}
	public void Close() {
		sn.close();
	}
	
}
