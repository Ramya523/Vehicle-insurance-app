package com.vehicle.beans;

public class Vehicle {
	
	private int  vehicleno;
	private int vehicletype;
	private int insuranceperiod;
	private String dateOfReg;
	private long aadharno;
	private long mobileno;
	private String dateOfRenewal;
	private int noOfDays;
	
	
	
	
	public Vehicle(int vehicleType2, int insurancePeriod, long aadhar, long mobile, String dateOfReg,
			String dateOfRenewal, int noOfDays) {
		// TODO Auto-generated constructor stub
	}


	


	public String setDateOfReg(String dateOfReg) {
		return this.dateOfReg = dateOfReg;
	}


	public String getDateOfRenewal() {
		return dateOfRenewal;
	}


	public void setDateOfRenewal(String dateOfRenewal) {
		this.dateOfRenewal = dateOfRenewal;
	}


	public int getNoOfDays() {
		return noOfDays;
	}


	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}


	public int getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(int vehicleno) {
		this.vehicleno = vehicleno;
	}
	public int getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(int vehicletype) {
		this.vehicletype = vehicletype;
	}
	public int getInsuranceperiod() {
		return insuranceperiod;
	}
	public void setInsuranceperiod(int insuranceperiod) {
		this.insuranceperiod = insuranceperiod;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
	
	
	

}
