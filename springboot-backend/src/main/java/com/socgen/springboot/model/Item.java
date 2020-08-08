package com.socgen.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "itemname")
	private String ItemName;

	@Column(name = "quantity")
	private long Quantity;
	
	@Column(name = "cost")
	private long Cost;
	
	public Item(String ItemName, String Quantity, String Cost) {
		this.ItemName = ItemName;
		this.Quantity = Long.parseLong(Quantity);
		this.Cost = Long.parseLong(Cost);
	}

	public Item() {
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getItemName() {
		return ItemName;
	}

	public long getQuantity() {
		return Quantity;
	}

	public long getCost() {
		return Cost;
	}

	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}

	public void setQuantity(long Quantity) {
		this.Quantity = Quantity;
	}

	public void setCost(long Cost) {
		this.Cost = Cost;
	}
}
