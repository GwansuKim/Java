package com.yedam.java.ch01_01;

public class SmarTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.search("네이버");
		tv.setVolume(20);
		tv.setVolume(-10);
		tv.turnOff();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}
