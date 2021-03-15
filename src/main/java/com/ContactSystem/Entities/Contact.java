package com.ContactSystem.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact 
{
	@Id
    long Phone;
    String FirstName;
    String LastName;
    String Email;
    String State; 
    String Address;
    
    
    
    
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(long phone, String firstName, String lastName, String email, String state, String address) {
		super();
		Phone = phone;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		State = state;
		Address = address;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Contact [Phone=" + Phone + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", State=" + State + ", Address=" + Address + "]";
	}
    
    
    
    
}