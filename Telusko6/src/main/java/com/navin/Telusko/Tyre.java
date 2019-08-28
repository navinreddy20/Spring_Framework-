package com.navin.Telusko;

import org.springframework.stereotype.Component;

@Component
public class Tyre
{
	private String brand;
	


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Its working...";
	}
	
	
}
