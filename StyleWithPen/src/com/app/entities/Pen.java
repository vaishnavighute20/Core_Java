 package com.app.entities;

import java.time.LocalDate;

public class Pen {
	
	
/*ID (unique identifier for each Pen, should be generated automatically)
	b.	Brand (Example:  Cello, Parker, Reynolds etc.)
	c.	Color
	d.	InkColor
	e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
	f.	Stock (Available quantity)
	g.	Stock Update Date (it changed every time when admin update stock or user order executed)
	h.	Stock Listing Date (date on which product is added to site for sale)
	i.	Price (in INR) 
	j.	Discounts (in percentage)
*/
	private int id;
	private String brand;
	private String color;
	private String inkcolor;
	private String material;
	private int stock;
	private LocalDate stockupdatedate;
	private LocalDate stocklistingDate;
	private double price;
	private double discount;
	public static int counter=1;

public Pen(int id, String brand, String color, String inkcolor, String material, int stock, LocalDate stockupdatedate,
		LocalDate stocklistingDate, double price, double discount) {
	super();
	this.id = id;
	this.brand = brand;
	this.color = color;
	this.inkcolor = inkcolor;
	this.material = material;
	this.stock = stock;
	this.stockupdatedate = stockupdatedate;
	this.stocklistingDate = stocklistingDate;
	this.price = price;
	this.discount = discount;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getInkcolor() {
	return inkcolor;
}

public void setInkcolor(String inkcolor) {
	this.inkcolor = inkcolor;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}

public LocalDate getStockupdatedate() {
	return stockupdatedate;
}

public void setStockupdatedate(LocalDate stockupdatedate) {
	this.stockupdatedate = stockupdatedate;
}

public LocalDate getStocklistingDate() {
	return stocklistingDate;
}

public void setStocklistingDate(LocalDate stocklistingDate) {
	this.stocklistingDate = stocklistingDate;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public double getDiscount() {
	return discount;
}

public void setDiscount(double discount) {
	this.discount = discount;
}

public static int getCounter() {
	return counter;
}

public static void setCounter(int counter) {
	Pen.counter = counter;
}

@Override
public String toString() {
	return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkcolor=" + inkcolor + ", material="
			+ material + ", stock=" + stock + ", stockupdatedate=" + stockupdatedate + ", stocklistingDate="
			+ stocklistingDate + ", price=" + price + ", discount=" + discount + "]";
}	


}
	  