package com.invoice.billing;

import java.math.BigDecimal;
import java.util.UUID;

public class BillingItems {
	
	public BillingItems(String name, ItemType type, int qty, BigDecimal price) {
		this.setId(UUID.randomUUID().toString());
		this.type=type;
		this.quantity=qty;
		this.price=price;
		this.name=name;
	}
	
	private String id;
	
	private String name;
	
	private ItemType type;
	
	private int quantity;
	
	private BigDecimal price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
