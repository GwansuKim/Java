package com.yedam.java.ch02_02;

public class SmartTelevision implements SmartTv {

	// 필드
	private int volume;

	// 생성자
	// 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VLAUE) {
			this.volume = RemoteControl.MAX_VLAUE;
		} else if (volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "를 검색합니다");
	}

	@Override
	public void alarm(String time) {
		// TODO Auto-generated method stub

	}

}
