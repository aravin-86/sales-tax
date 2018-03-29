package com.sales.tax.item;

import java.util.List;

public class ShoppingBasketBuilder {

	public static Item createItem(String itemTitle,ItemTypeEnum itemType, int quantity, double itemPrice, boolean isImported){
		Item item=new Item();
		item.setItemTitle(itemTitle);
		item.setItemType(itemType);
		item.setQuantity(quantity);
		item.setItemPrice(itemPrice);
		item.setImported(isImported);
		return item;
	}
	
	public static void basketOne(List<Item> itemList){
		itemList.add(createItem("book", ItemTypeEnum.BOOKS, 1, 12.49, false));
		itemList.add(createItem("music CD", ItemTypeEnum.OTHERS, 1, 14.99, false));
		itemList.add(createItem("chocolate bar", ItemTypeEnum.FOOD, 1, 0.85, false));
	}
	
	public static void basketTwo(List<Item> itemList){
		itemList.add(createItem("box of chocolates", ItemTypeEnum.FOOD, 1, 10.0, true));
		itemList.add(createItem("bottle of perfume", ItemTypeEnum.OTHERS, 1, 47.50, true));
		
	}
	
	public static void basketThree(List<Item> itemList){
		itemList.add(createItem("bottle of perfume", ItemTypeEnum.OTHERS, 1, 27.99, true));
		itemList.add(createItem("bottle of perfume", ItemTypeEnum.OTHERS, 1, 18.99, false));
		itemList.add(createItem("packet of headache pills", ItemTypeEnum.MEDICAL_PRODUCTS, 1, 9.75, false));
		itemList.add(createItem("box of chocolates", ItemTypeEnum.FOOD, 1, 11.25, true));
	}
	
	public static void basketFourWithInvalidInput(List<Item> itemList){
		itemList.add(createItem("box of chocolates", ItemTypeEnum.FOOD, -1, 10.0, true));
		itemList.add(createItem("bottle of perfume", ItemTypeEnum.OTHERS, 1, 47.50, true));
	}
}
