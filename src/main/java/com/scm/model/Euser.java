package com.scm.model;

public class Euser {
	private int UserID;
	private String UserName;
	private String UserPassword;
	private String UserCity;

//	public Euser() {
//
//	}

	public Euser(int userID, String userName, String userPassword, String userCity) {
		super();
		UserID = userID;
		UserName = userName;
		UserPassword = userPassword;
		UserCity = userCity;
	}
	public Euser(int userID, String userName, String userCity) {
		super();
		UserID = userID;
		UserName = userName;
		UserCity = userCity;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	public String getUserCity() {
		return UserCity;
	}

	public void setUserCity(String userCity) {
		UserCity = userCity;
	}

	@Override
	public String toString() {
		return "Euser [UserID=" + UserID + ", UserName=" + UserName + ", UserPassword=" + UserPassword + ", UserCity="
				+ UserCity + "]";
	}

}
