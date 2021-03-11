package com.getpaymentdb.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CardExpiry {
	
	private String month;
	
	@Id
	private String year;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "CardExpiry [month=" + month + ", year=" + year + "]";
	}
	
	

}
