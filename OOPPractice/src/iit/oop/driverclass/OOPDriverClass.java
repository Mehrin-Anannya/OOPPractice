package iit.oop.driverclass;

import iit.oop.inheritance.MountainBike;

public class OOPDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike bike = new MountainBike(3, 200, 0);
		bike.setHeight(12);
		System.out.println(bike.toString());
	}

}
