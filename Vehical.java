package com.hibernate.onetomany.mapping.ManyToOneMappedBY;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehical {
	@Id
	private int vId;
	private String vName;
	private int vPrice;
	
	@ManyToOne
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public int getvPrice() {
		return vPrice;
	}
	public void setvPrice(int vPrice) {
		this.vPrice = vPrice;
	}
	@Override
	public String toString() {
		return "Vehical [vId=" + vId + ", vName=" + vName + ", vPrice=" + vPrice + ", person=" + person + "]";
	}
	
	
	

}
