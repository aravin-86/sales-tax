package com.sales.tax.calculator;

import com.sales.tax.item.Item;

public class TaxCalculatorBusinessDelegate {
  
	public double computeSalesTax(Item item){
		return new SalesTaxCalculator().computeSalesTax(item);
	}
}
