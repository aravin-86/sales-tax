package com.sales.tax.util;


public class RoundOffUtil {

	/**
	 * This method rounds off the value nearest to 0.05
	 * 
	 * @param value
	 * @return roundedOff Value
	 */
	public static double roundOff(double value){
		double rValue=0.0;
		rValue=Math.ceil(value * 20.0)/20.0;
		return rValue;
	}
	
	
}
