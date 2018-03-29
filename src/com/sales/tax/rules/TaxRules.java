package com.sales.tax.rules;

import com.sales.tax.item.Item;


public interface TaxRules {
	boolean check(Item item);
	double compute(Item item);
}
