package com.ty.food.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Taxs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int cgst;
	private int sgst;
	private int foodgst;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCgst() {
		return cgst;
	}
	public void setCgst(int cgst) {
		this.cgst = cgst;
	}
	public int getSgst() {
		return sgst;
	}
	public void setSgst(int sgst) {
		this.sgst = sgst;
	}
	public int getFoodgst() {
		return foodgst;
	}
	public void setFoodgst(int foodgst) {
		this.foodgst = foodgst;
	}
	
	

}
