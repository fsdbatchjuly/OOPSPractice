package com.y4j.khaja.oops.car;

public class ApplicationMain {

	public static void main(String[] args) {
		
		Car ford = new Car();

		 Tyre frontLeftTyre = new Tyre("Black", 30, 20, 20, 5000, "Alloy Wheels", "Front Left Tyre");
			Tyre frontRightTyre = new Tyre("Black", 40, 30, 20, 5000, "Alloy Wheels", "Front Right Tyre");
			Tyre backleftTyre = new Tyre("Black", 54, 40, 30, 5000, "Alloy Wheels", "Back Left Tyre");
			Tyre backRightTyre = new Tyre("Black", 50, 50, 20, 5000, "Alloy Wheels", "Back Right Tyre");


			Door frgtDoor = new Door(1, 300, 200, "Iron", true, "Front Right Door");
			Door flftDoor = new Door(1, 300, 200, "Iron", true, "Front Left Door");
			Door brgtDoor = new Door(1, 300, 200, "Iron", true, "Back Right Door");
			Door blftDoor = new Door(1, 300, 200, "Iron", true, "Back Left Door");

			Light frontleftlight = new Light ("Headlight", "red", 5, 1000);
			Light frontrightlight = new Light ("Parking light"," red", 5,1000 );
			Light backleftlight =  new  Light ("indicators", "red", 5, 1000);
			Light backrightlight = new Light  ("moving light", "red", 5,1000 );

			
		    Seat  frontleftseat =  new Seat("black", 50, 30, 20, 10, "fibre", "sleepwell", 5000);
		    Seat  frontrightseat = new Seat("black", 50, 30, 20, 10, "fibre", "sleepwell", 5000);
		    Seat  backsofseat =    new Seat("black", 50, 30, 20, 10, "fibre", "sleepwell", 5000);

		    Steering  frontleftsteering = new Steering("telescope","black", false,10000 );
		    Steering  frontrightsteering = new Steering( "Automatic", "black", false, 10000);

		    ford.frontLeftTyre = frontLeftTyre;
			ford.frontRightTyre = frontRightTyre;
			ford.backLeftTyre = backleftTyre;
			ford.backRightTyre = backRightTyre;

			ford.frontLeftDoor = flftDoor;
			ford.frontRightDoor = frgtDoor;
			ford.backRightDoor = brgtDoor;
			ford.backLeftDoor = blftDoor;


			ford.frontRightDoor.openWindow();
			ford.frontRightDoor.closeWindow();
			ford.frontRightDoor.openDoor();
			ford.frontRightDoor.closeDoor();

		ford. frontLeftTyre.startMoving();
	 ford. frontRightTyre.startMoving();
			ford. backLeftTyre.stopMoving();
			ford.backRightTyre.stopMoving();

			ford. frontleftlight =frontleftlight;
			ford. frontrightlight= frontrightlight;
			ford. backleftlight= backleftlight;
			ford. backrightlight = backrightlight;

			ford. frontleftlight .switchOff();
			ford. frontrightlight.switchOn();
			ford. backleftlight.switchOff();
			ford. backrightlight .switchOn();

		

	        ford.frontleftseat = frontleftseat;
	        ford.frontrightseat = frontrightseat;
	        ford.backsofaseat = backsofseat;

	        ford.frontleftseat.forwardFacingSeats();
	        ford.frontrightseat.forwardFacingSeats();
	        ford.backsofaseat.rearFacingseats();

	        ford.frontleftsteering =frontleftsteering;
	        ford.frontrightsteering = frontrightsteering;

	        ford.frontleftsteering.startAngle();
	        ford.frontrightsteering.stopAngle();

	}

}
