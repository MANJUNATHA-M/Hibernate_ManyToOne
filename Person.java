package com.hibernate.onetomany.mapping.ManyToOneMappedBY;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	private int pId;
	private String pName;
	private int pContact;
	
//	@OneToMany
	
	// it will
	
	@OneToMany(mappedBy = "person")
	private List<Vehical> vlist=new ArrayList<Vehical>();

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpContact() {
		return pContact;
	}

	public void setpContact(int pContact) {
		this.pContact = pContact;
	}

	public List<Vehical> getVlist() {
		return vlist;
	}

	public void setVlist(List<Vehical> vlist) {
		this.vlist = vlist;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pContact=" + pContact + ", vlist=" + vlist + "]";
	}
	
	
	

}
