package com.sales.tax.item;

import java.util.ArrayList;
import java.util.List;

public class ItemValidator {
  
	public List<ErrorObj> validate(Item item){
		List<ErrorObj> eList=new ArrayList<ErrorObj>();
		if(item.getQuantity()<=0){
			ErrorObj e=new ErrorObj();
			e.setErrorMsg("Quantity is not valid.");
			eList.add(e);
		}
		
		if(item.getItemPrice()<=0){
			ErrorObj e=new ErrorObj();
			e.setErrorMsg("Price is not valid.");
			eList.add(e);
		}
				
		return eList;
   }
}
