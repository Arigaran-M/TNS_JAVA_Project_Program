package com.tnsif.day4.RectanglePattern;

public class RactanglePattern {
	
	RactanglePattern(int num){
		for (int i=1; i<=num ; i++) {
	    	 if(i==1) {
	    		 for(int j = 1;j<=num ; j++) {
	    			 System.out.print(j + " ");
	    			}
	    	 }
	    	 else if (i==num) {
	    		 for(int j = num;j>= 1  ; j--) {
	    			 System.out.print(j + " ");
	    		 }
	    	 }
	    	 else {
	    		 System.out.print(i + " ");
	    		 for(int j =1 ; j<=num-2 ; j++) {
	    			 System.out.print("  ");
	    		 }
	    		 System.out.print(num+1-i);
	    	 }
	    	 System.out.println();
	     }
	}
}
