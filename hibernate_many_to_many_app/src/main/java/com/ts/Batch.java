package com.ts;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Batch {
	@Id
	private int id;
	private String name;
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Batch [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	
	

}
