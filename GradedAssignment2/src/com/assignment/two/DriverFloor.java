package com.assignment.two;

import java.util.ArrayList;

public class DriverFloor {

	public static void main(String[] args) {

		BuildingFloors build=new BuildingFloors();
		System.out.println("Enter the Total no. of Floor in Building");
		int size = build.getBuildingFloors();
		
		ArrayList<Integer> floor = new ArrayList<Integer>();
		
		floor = build.getFloorDeliverySchedule(size);
		System.out.println("Delivery Schedule of Floors is as follows ->");
		build.printFloorDeliverySchedule(floor);
		
	    System.out.println("Construction Schedule of Floors is as Follows ->");
	    build.printFloorConstructSchedule(floor);

	}

}
