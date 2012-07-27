package com.durasoft;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Summary {
	private String city;
	private String temparature;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTemparature() {
		return temparature;
	}
	public void setTemparature(String temparature) {
		this.temparature = temparature;
	}

}
