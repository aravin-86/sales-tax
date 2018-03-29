package com.sales.tax.rules;

import java.util.LinkedHashSet;
import java.util.Set;

public class TaxRulesManager {
  
	public Set<TaxRules> createSalesTaxRuleSet(){
		Set<TaxRules> ruleSet=new LinkedHashSet<TaxRules>();
		ruleSet.add(new SalesTaxExemptionRule());
		ruleSet.add(new SalesTaxRule());
		ruleSet.add(new ImportDutyTaxRule());
		//add new rules if any
		
		return ruleSet;
	}

}
