package com.ts;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	private int user_id;
	private String name;
	private String address;
	
	@OneToMany
	@JoinTable( name="u_d", 
			    joinColumns = {@JoinColumn(name="uid")},
			    inverseJoinColumns = {@JoinColumn(name="did")})
	
	private List<Document> documents; 
	
	
	
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	
	public User() {}
	
	public User(int user_id, String name, String address, List<Document> documents) {

		this.user_id = user_id;
		this.name = name;
		this.address = address;
		this.documents = documents;
	}
	

	
	
	
}
