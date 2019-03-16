package com.vehicle.dao;

import com.vehicle.beans.Vehicle;

public interface Vehicledao {
	
	Vehicle register(Vehicle vehicle);
	Vehicle check(Vehicle vehicle);

}
