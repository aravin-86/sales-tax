package com.sales.tax.item;

/**
 * 
 * This class defines the item inputted by the user.
 *
 */
public class Item {
 
	 private String itemTitle;
	 private ItemTypeEnum itemType;
	 private int quantity;
	 private double itemPrice;
	 private boolean isImported;
	 
	 
	/**
	 * @return the itemTitle
	 */
	public String getItemTitle() {
		return itemTitle;
	}
	/**
	 * @param itemTitle the itemTitle to set
	 */
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	/**
	 * @return the itemType
	 */
	public ItemTypeEnum getItemType() {
		return itemType;
	}
	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(ItemTypeEnum itemType) {
		this.itemType = itemType;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the itemPrice
	 */
	public double getItemPrice() {
		return itemPrice;
	}
	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	/**
	 * @return the isImported
	 */
	public boolean isImported() {
		return isImported;
	}
	/**
	 * @param isImported the isImported to set
	 */
	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	 
	
	 
}
