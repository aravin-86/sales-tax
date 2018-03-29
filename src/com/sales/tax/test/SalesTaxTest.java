package com.sales.tax.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.sales.tax.calculator.ReceiptGenerator;
import com.sales.tax.item.ErrorObj;
import com.sales.tax.item.Item;
import com.sales.tax.item.ItemValidator;
import com.sales.tax.item.ShoppingBasketBuilder;

public class SalesTaxTest extends TestCase {
	
	private List<Item> itemList;
	
	protected void setUp() throws Exception {
		itemList=new ArrayList<Item>();
	}

	protected void tearDown() throws Exception {
		itemList=null;
	}

	public void testReceiptGeneratorForInput1(){
		ShoppingBasketBuilder.basketOne(itemList);
		ReceiptGenerator.generateInventory(itemList);
		assertTrue(true);
	}
	
	public void testReceiptGeneratorForInput2(){
		ShoppingBasketBuilder.basketTwo(itemList);
		ReceiptGenerator.generateInventory(itemList);
		assertTrue(true);
	}
	
	public void testReceiptGeneratorForInput3(){
		ShoppingBasketBuilder.basketThree(itemList);
		ReceiptGenerator.generateInventory(itemList);
		assertTrue(true);
	}
	
	public void testReceiptGeneratorForInvalidInput(){
		ShoppingBasketBuilder.basketFourWithInvalidInput(itemList);
		ItemValidator validator=new ItemValidator();
		for (Item item : itemList) {
			List<ErrorObj> eList=validator.validate(item);
			assertEquals("Item- "+item.getItemTitle()+"- not valid.", eList.isEmpty(), false);
			break;
		}
		
	}
	
	
}
