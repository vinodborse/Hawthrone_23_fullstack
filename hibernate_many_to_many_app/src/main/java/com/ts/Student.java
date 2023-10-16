package com.ts;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private String address;
	
	@ManyToMany
	private List<Batch> batches;
	
	public List<Batch> getBatches() {
		return batches;
	}
	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Student() {};
	public Student(int rollno, String name, String address, List<Batch> batches) {

		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.batches = batches;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", batches=" + batches + "]";
	}
	
	

}
