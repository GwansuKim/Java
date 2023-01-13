package com.yedam.ch06;

public class Car {
	private int speed;
	private int maxSpeed;
	private String model;
	
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}
	
	public String getModel() {
		return this.model;
	}
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	public int getSpeed() {
		return this.speed;
	}
	public int setSpeed(int speed) {
		return this.speed = speed;
	}
}
