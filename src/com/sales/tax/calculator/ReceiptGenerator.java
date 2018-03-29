package com.sales.tax.calculator;

import java.util.ArrayList;
import java.util.List;

import com.sales.tax.item.ErrorObj;
import com.sales.tax.item.Item;
import com.sales.tax.item.ItemValidator;
import com.sales.tax.item.LineItem;
import com.sales.tax.util.RoundOffUtil;

public class ReceiptGenerator {
	
	public static void generateInventory(List<Item> itemList){
		List<LineItem> inventory=new ArrayList<LineItem>();
		double totalSalesTax=0.0;
		double totalAmt=0.0;
		TaxCalculatorBusinessDelegate bDelegate=new TaxCalculatorBusinessDelegate();
		ItemValidator validator=new ItemValidator();
		for (Item item : itemList) {
			List<ErrorObj> eList=validator.validate(item);
			if(!eList.isEmpty()){
				printValidationErrors(item, eList);
				return;
			}
			double salesTaxForItem=bDelegate.computeSalesTax(item);
			totalSalesTax += salesTaxForItem;
			double itemPricePlusSalesTax=RoundOffUtil.roundOff(item.getItemPrice()+salesTaxForItem);
			//total price calculation
			totalAmt += itemPricePlusSalesTax;
			
			addLineItem(inventory, item, itemPricePlusSalesTax);
			
		}
		
		printReceipts(inventory, RoundOffUtil.roundOff(totalSalesTax), totalAmt);
		
	}

	private static void printValidationErrors(Item item, List<ErrorObj> eList) {
		System.out.println("For item : "+item.getItemTitle());
		for (ErrorObj errorObj : eList) {					
			System.out.println(errorObj.getErrorMsg());
		}
	}

	private static void addLineItem(List<LineItem> inventory, Item item,
			double itemPricePlusSalesTax) {
		LineItem lItem=new LineItem();
		lItem.setItemTitle(item.getItemTitle());
		lItem.setItemPricePlusSalesTax(itemPricePlusSalesTax);
		lItem.setQuantity(item.getQuantity());
		lItem.setImported(item.isImported());
		inventory.add(lItem);
	}

	private static void printReceipts(List<LineItem> inventory, double salesTaxes, double total){
		for (LineItem lineItem : inventory) {
			String importedText="";
			if(lineItem.isImported()){
				importedText=" imported";
			}
			System.out.println(lineItem.getQuantity()+importedText+" "+lineItem.getItemTitle()+": "+lineItem.getItemPricePlusSalesTax());			
		}
		
		System.out.println("Sales Taxes: "+salesTaxes);
		System.out.println("Total: "+total);
		System.out.println("****END*****");
		System.out.println();
	}
}
