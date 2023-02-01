package com.yedam.game;

public class User {
	private String userId;
	private String password;
	private int newRecord;
	private int longestLength;
	private int playCount;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNewRecord() {
		return newRecord;
	}
	public void setNewRecord(int newRecord) {
		this.newRecord = newRecord;
	}
	public int getLongestLength() {
		return longestLength;
	}
	public void setLongestLength(int longestLength) {
		this.longestLength = longestLength;
	}
	public int getPlayCount() {
		return playCount;
	}
	public void setPlayCount(int playCount) {
		this.playCount = playCount;
	}
	
}
