package com.sales.tax.rules;

import com.sales.tax.item.Item;

public class SalesTaxExemptionRule implements TaxRules {

	@Override
	public boolean check(Item item) {
		boolean isExempted=false;
		switch(item.getItemType()){
			case FOOD: {
				isExempted=true;
				break;
			}
			
			case BOOKS: {
				isExempted=true;
				break;
			}
			case MEDICAL_PRODUCTS: {
				isExempted=true;
				break;
			}
			
			default: {
				isExempted=false;				
			}
		}
		return isExempted;
	}
	
	public double compute(Item item){		
		return 0.0;
	}

}
