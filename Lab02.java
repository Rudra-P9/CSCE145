//Name: Rudrakumar Patel

import java.util.Scanner;

public class Lab02 {
	
	public static final double ACC = 9.8;

	public static void main(String[] args) {
		
		//Name: Rudrakumar Patel
		
		//Acceleration due to gravity
		final double acceleration = 9.8;
		
		//scanner to take input
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the initial velocity of the ball (in meters per second) at point A: ");
		double initialVelocity = key.nextDouble();
		
		System.out.println("How much time (in seconds) does the ball take to reach point B: ");
		double time = key.nextDouble();
		
		//calculate
		double finalVelocity = initialVelocity + ACC * time;
		
		double distance = (initialVelocity * time) + (0.5 * ACC * Math.pow(time,2));
		
		//print the results
		System.out.println("Final Velocity of the ball = " + finalVelocity + " m/s");
		System.out.println("Distance traveled by the ball (S)= " + distance + " meters");
		
	}

}
