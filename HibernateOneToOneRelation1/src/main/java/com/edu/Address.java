package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
private int No;
private String Street, City, District,State;
private long Pincode;
@OneToOne
Student st;
public int getNo() {
	return No;
}
public void setNo(int no) {
	No = no;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getDistrict() {
	return District;
}
public void setDistrict(String district) {
	District = district;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public long getPincode() {
	return Pincode;
}
public void setPincode(long pincode) {
	Pincode = pincode;
}
public Student getSt() {
	return st;
}
public void setSt(Student st) {
	this.st = st;
}
@Override
public String toString() {
	return "Address [No=" + No + ", Street=" + Street + ", City=" + City + ", District=" + District + ", State=" + State
			+ ", Pincode=" + Pincode + ", st=" + st + "]";
}

}
