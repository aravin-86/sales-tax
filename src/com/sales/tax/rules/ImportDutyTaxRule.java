package com.sales.tax.rules;

import com.sales.tax.item.Item;

public class ImportDutyTaxRule implements TaxRules {

	@Override
	public boolean check(Item item) {
		return item.isImported();
	}

	@Override
	public double compute(Item item) {
		return item.getItemPrice()*item.getQuantity()* TaxRateConstants.IMPORT_DUTY_TAX;
	}

}
