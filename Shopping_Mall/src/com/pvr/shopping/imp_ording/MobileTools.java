package com.pvr.shopping.imp_ording;

import com.pvr.shopping.interfacesample.Order;

public class MobileTools implements Order{

	private static MobileTools mobiletools = new MobileTools();
	
	public static MobileTools getMobiletools() {
		return mobiletools;
	}

	public static void setMobiletools(MobileTools mobiletools) {
		MobileTools.mobiletools = mobiletools;
	}

	private MobileTools() {
		
	}
	
	@Override
	public void ordering() {
		// TODO Auto-generated method stub
		System.out.println("I am buying Bluetooth Headphones");
	}

}
