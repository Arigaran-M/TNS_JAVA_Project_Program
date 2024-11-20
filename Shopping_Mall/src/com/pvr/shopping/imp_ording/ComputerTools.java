package com.pvr.shopping.imp_ording;

import com.pvr.shopping.interfacesample.Order;

public class ComputerTools implements Order {

	private static ComputerTools computertools = new ComputerTools();
	
	public static ComputerTools getComputertools() {
		return computertools;
	}
	public static void setComputertools(ComputerTools computertools) {
		ComputerTools.computertools = computertools;
	}
	private ComputerTools() {
		
	}
	
	@Override
	public void ordering() {
		// TODO Auto-generated method stub
		System.out.println("I am buying Bluetooth Mouse");
	}

}
