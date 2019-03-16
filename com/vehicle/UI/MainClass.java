package com.vehicle.UI;

import java.util.Scanner;

import com.vehicle.beans.Vehicle;
import com.vehicle.service.VehicleService;
import com.vehicle.service.VehicleServiceImpl;

public class MainClass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Vehicle(0, 0, 0, 0, null, null, 0);
		VehicleService service=new VehicleServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("****welcome*****");
		while(true)
		{
		System.out.println("1) Vehicle insurance Registration\n 2) Insurance Validity Check\n 3) Exit ");
		int i=sc.nextInt();
		switch(i)
		{
		case 1:		System.out.println("enter the vehicle number :");
					vehicle.setVehicleno(sc.nextInt());
					System.out.println("enter vehicle type :");
					vehicle.setVehicletype(sc.nextInt());
					System.out.println("enter insurance period (years) :");
					vehicle.setInsuranceperiod(sc.nextInt());
					System.out.println("enter aadhar card number :");
					vehicle.setAadharno(sc.nextLong());
					System.out.println("enter the mobile number:");
					vehicle.setMobileno(sc.nextLong());
					Vehicle vehicle1=service.register(vehicle);
					System.out.println("registration successfull"+vehicle1);
					
				
			break;
		case 2: 	System.out.println("enter vehicle number");
					int vehicleNo=sc.nextInt();
					Vehicle vehicle11=service.check(vehicle);
					System.out.println(vehicle11.getInsuranceperiod());
					System.out.println(vehicle11.getDateOfRenewal());



				
			break;
			default:System.exit(0);
		}
		}

	}

}
