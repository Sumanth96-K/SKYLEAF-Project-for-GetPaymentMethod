package com.getpaymentdb.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReturnLink {
	@Id
	private String rel;
	private String href;
	private String method;
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	@Override
	public String toString() {
		return "ReturnLink [rel=" + rel + ", href=" + href + ", method=" + method + "]";
	}
	
	
	

}
