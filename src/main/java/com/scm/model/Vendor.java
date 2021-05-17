package com.scm.model;

public class Vendor {
	private int VrndorID;
	private String VendorName;
	private String VendorPassword;
	private String VendorCity;

//	public Vendor() {
//
//	}

	public Vendor(int vrndorID, String vendorName, String vendorPassword, String vendorCity) {
		super();
		VrndorID = vrndorID;
		VendorName = vendorName;
		VendorPassword = vendorPassword;
		VendorCity = vendorCity;
	}
	public Vendor(int vrndorID, String vendorName, String vendorCity) {
		super();
		VrndorID = vrndorID;
		VendorName = vendorName;
		VendorCity = vendorCity;
	}

	public int getVrndorID() {
		return VrndorID;
	}

	public void setVrndorID(int vrndorID) {
		VrndorID = vrndorID;
	}

	public String getVendorName() {
		return VendorName;
	}

	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}

	public String getVendorPassword() {
		return VendorPassword;
	}

	public void setVendorPassword(String vendorPassword) {
		VendorPassword = vendorPassword;
	}

	public String getVendorCity() {
		return VendorCity;
	}

	public void setVendorCity(String vendorCity) {
		VendorCity = vendorCity;
	}
	@Override
	public String toString() {
		return "Vendor [VrndorID=" + VrndorID + ", VendorName=" + VendorName + ", VendorPassword=" + VendorPassword
				+ ", VendorCity=" + VendorCity + "]";
	}

}
