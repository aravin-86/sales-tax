package com.sales.tax.calculator;

import java.util.Set;

import com.sales.tax.item.Item;
import com.sales.tax.rules.TaxRules;
import com.sales.tax.rules.TaxRulesManager;
import com.sales.tax.util.RoundOffUtil;

public class SalesTaxCalculator {	

	public double computeSalesTax(Item item){
		TaxRulesManager engine=new TaxRulesManager();
		Set<TaxRules> sRuleSet=engine.createSalesTaxRuleSet();
		double salesTax=0.0;
		for (TaxRules taxRules : sRuleSet) {
			if(taxRules.check(item)){
				salesTax += taxRules.compute(item);
			}
		}						
		
		return RoundOffUtil.roundOff(salesTax);
	}
	
}
