package com.vehicle.dao;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;


import com.vehicle.beans.Vehicle;

public class VehicledaoImpl implements Vehicledao {
	
	Map<Integer, Vehicle> vehicleEntry;
	
	public Vehicle register(Vehicle vehicle) {
		HashMap<Integer, Vehicle> vehicleEntry=new HashMap<Integer, Vehicle>();
		int vehicleNo=vehicle.getVehicleno();
		int vehicleType=vehicle.getVehicletype();
		int insurancePeriod=vehicle.getInsuranceperiod();
		LocalTime time=LocalTime.now();
		String dateOfReg=vehicle.setDateOfReg(time.toString());
		String dateOfRenewal=dateOfReg+insurancePeriod;
		int noOfDays=dateOfReg.length()-dateOfRenewal.length();
		long aadhar=vehicle.getAadharno();
		long mobile=vehicle.getMobileno();
		for(Map.Entry m: vehicleEntry.entrySet()) {
			vehicle=((HashMap<Integer, Vehicle>) m).put(vehicleNo,new Vehicle(vehicleType,insurancePeriod,aadhar,mobile,dateOfReg,dateOfRenewal,noOfDays));
	}
	return vehicle;
	}

	public Vehicle check(Vehicle vehicle) {
		int vehicleNo=vehicle.getVehicleno();
		for(Map.Entry m: vehicleEntry.entrySet()) {
			if(m.getKey().equals(vehicleNo)){
				int insurancePeriod=vehicle.getInsuranceperiod();
				String dateOfRenewal=vehicle.getDateOfRenewal();
			}
		}
		return vehicle;
	}

}
