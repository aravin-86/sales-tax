package com.sales.tax.rules;

import com.sales.tax.item.Item;
import com.sales.tax.item.ItemTypeEnum;

public class SalesTaxRule implements TaxRules {

	@Override
	public boolean check(Item item) {
		if(item.getItemType()==ItemTypeEnum.OTHERS){
			return true;
		}
		return false;
	}
	
	public double compute(Item item){		
		return item.getItemPrice()*item.getQuantity()* TaxRateConstants.SALES_TAX_RATE;
	}

}
