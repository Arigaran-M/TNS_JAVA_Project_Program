package com.tnsif.day4.DigitSum;

public class DigitSum {
	
	private int Start;
	private int End;
	private int Target;
	
	DigitSum(int Start, int End, int Target){
		this.Start = Start;
		this.End = End;
		this.Target = Target;
		
		if(Start > End) {
			System.out.println("Please Enter The Correct Starting and Ending Value !");
		}
		else {
			int Reminder;
			int Digit;
			int Temp;
			int Count = 0;
			
			for (int i = this.Start ; i <= this.End ; i++) {
				Digit = 0;
				Temp = i;
				
				while (Temp > 0) {
					Reminder = Temp%10;
					Digit += Reminder;
					Temp /= 10;
				}
				
				if(Digit == this.Target) {
					Count += 1;
					if(Count == 1) {
						System.out.print("This are the Value Between "+this.Start+" and "+this.End+": ");
					}
					System.out.print(i+" ");
				}
			}
			if(Count == 0) {
				System.out.println("This is no Value Between "+this.Start+" and "+this.End+" !");
			}
		}	
	}
}
