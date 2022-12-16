package com.example.demo.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String assttype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssttype() {
		return assttype;
	}
	public void setAssttype(String assttype) {
		this.assttype = assttype;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", assttype=" + assttype + "]";
	}

}
