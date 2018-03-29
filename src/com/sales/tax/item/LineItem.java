package com.sales.tax.item;

/**
 * 
 * This class defines line items displayed in the receipt.
 *
 */
public class LineItem {
 
	 private String itemTitle;
	 private int quantity;
	 private double itemPricePlusSalesTax;
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
	 * @return the itemPricePlusSalesTax
	 */
	public double getItemPricePlusSalesTax() {
		return itemPricePlusSalesTax;
	}
	/**
	 * @param itemPricePlusSalesTax the itemPricePlusSalesTax to set
	 */
	public void setItemPricePlusSalesTax(double itemPricePlusSalesTax) {
		this.itemPricePlusSalesTax = itemPricePlusSalesTax;
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
