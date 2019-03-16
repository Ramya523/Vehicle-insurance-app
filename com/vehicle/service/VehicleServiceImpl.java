package com.vehicle.service;


import com.vehicle.beans.Vehicle;
import com.vehicle.dao.Vehicledao;
import com.vehicle.dao.VehicledaoImpl;

public class VehicleServiceImpl implements VehicleService {
	
	

	public Vehicle register(Vehicle vehicle) {
		Vehicledao dao=new VehicledaoImpl();
	
		
		return dao.register(vehicle) ;
	}

	public Vehicle check(Vehicle vehicle) {
		Vehicledao dao=new VehicledaoImpl();
		return dao.check(vehicle);
	}

	

}
