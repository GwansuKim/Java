package com.yedam.java.ch02;

public class Agency implements Rentable<Home, RentalList> {

	@Override
	public Home rent() {
		// TODO Auto-generated method stub
		return new Home();
	}

	@Override
	public RentalList getCount() {
		// TODO Auto-generated method stub
		return new RentalList();
	}
	
}
