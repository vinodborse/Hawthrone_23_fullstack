package com.ts;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Marks {
	@Id
	private int id;
	
	private int per;
	
	@OneToOne
	private Student std;
	
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}

	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	
	public Marks() {}
	
	public Marks(int id, int per, Student std) {
	
		this.id = id;
		this.per = per;
		this.std = std;
	}
	
	
	
	
}
