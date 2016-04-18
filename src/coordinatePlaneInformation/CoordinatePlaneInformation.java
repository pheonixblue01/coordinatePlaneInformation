package coordinatePlaneInformation;

////////////////////////////////////////////////
/// Name: David Fletcher                     ///
/// CSc 2010, Principles of Computer Science ///
/// Fall 2013                                ///
/// Assignment 3; Coordinate Plane (#2)      ///
/// Submitted: 10/3/2013                     ///
////////////////////////////////////////////////

import java.lang.Math;
import java.util.Scanner; // Allows for use of input from the user


public class CoordinatePlaneInformation {

	public static void main(String[] args) {
		
		//I will set all of the coordinate points as doubles to avoid complications and miscalculations
		double xCoordinatePointA = 0.0;
		double yCoordinatePointA = 0.0;
		double xCoordinatePointB = 0.0;
		double yCoordinatePointB = 0.0;
		double xCoordinatePointC = 0.0;
		double yCoordinatePointC = 0.0;
		double greatestDistance = 0.0; // This variable will be used to store the largest distance, which will be calculated later.
		double sumOfSmallerDistances = 0.0; // This variable will be used to store the sum of all three distances, minus the greatestDistance variable
		
		Scanner input = new Scanner (System.in); //This will allow the user to input values for the coordinates of the various points.
		System.out.println ("Enter X Coordinate of Point A");
		xCoordinatePointA = input.nextDouble(); //
		
		System.out.println ("Enter Y Coordinate of Point A");
		yCoordinatePointA = input.nextDouble(); //
		
		System.out.println ("Enter X Coordinate of Point B");
		xCoordinatePointB = input.nextDouble(); //
		
		System.out.println ("Enter Y Coordinate of Point B");
		yCoordinatePointB = input.nextDouble(); //
		
		System.out.println ("Enter X Coordinate of Point C");
		xCoordinatePointC = input.nextDouble(); //
		
		System.out.println ("Enter Y Coordinate of Point C");
		yCoordinatePointC = input.nextDouble(); //
		
		double distanceAtoB = Math.sqrt (((xCoordinatePointA - xCoordinatePointB) * (xCoordinatePointA - xCoordinatePointB)) + ((yCoordinatePointA- yCoordinatePointB)*(yCoordinatePointA- yCoordinatePointB)));
		double distanceBtoC = Math.sqrt (((xCoordinatePointB - xCoordinatePointC) * (xCoordinatePointB - xCoordinatePointC)) + ((yCoordinatePointB- yCoordinatePointC)*(yCoordinatePointB- yCoordinatePointC)));
		double distanceAtoC = Math.sqrt (((xCoordinatePointA - xCoordinatePointC) * (xCoordinatePointA - xCoordinatePointC)) + ((yCoordinatePointA- yCoordinatePointC)*(yCoordinatePointA- yCoordinatePointC)));
		
		if (((distanceAtoB==distanceBtoC) && (distanceAtoB==distanceAtoC)) && ((distanceAtoB!=0) && (distanceBtoC!=0) && (distanceAtoC!=0)) ){ // this tests if the distances are equal, but not zero.
			
			greatestDistance = distanceAtoB;
			sumOfSmallerDistances = (distanceBtoC + distanceAtoC);

			System.out.println ("The distance between Point A and B is " +distanceAtoB);
			System.out.println ("The distance between Point B and C is " +distanceBtoC);
			System.out.println ("The distance between Point A and C is " +distanceAtoC);
			System.out.println("The maximum distance is " + greatestDistance);
			System.out.println("The sum of the other two distances is "+sumOfSmallerDistances);
			System.out.println("You have an equlateral triangle!");
		
		} else if ((distanceAtoB==0) && (distanceBtoC==0) && (distanceAtoC==0)){ // this tells the program what to do if all of the distances are equal to 0.
			
			greatestDistance = distanceAtoB;
			sumOfSmallerDistances = (distanceBtoC + distanceAtoC);

			System.out.println ("The distance between Point A and B is " +distanceAtoB);
			System.out.println ("The distance between Point B and C is " +distanceBtoC);
			System.out.println ("The distance between Point A and C is " +distanceAtoC);
			System.out.println("The maximum distance is " + greatestDistance);
			System.out.println("The sum of the other two distances is "+sumOfSmallerDistances);
			System.out.println("You have an only one point! Please check your points again!");
		
		} else if((((distanceAtoB!=distanceBtoC)&&(distanceAtoB!=distanceAtoC)&&(distanceBtoC!=distanceAtoC)) || ((distanceAtoB!=distanceBtoC)&&(distanceAtoB==distanceAtoC)&&(distanceBtoC==distanceAtoC)) || ((distanceAtoB==distanceBtoC)&&(distanceAtoB!=distanceAtoC)&&(distanceBtoC==distanceAtoC)) ||
				 ((distanceAtoB==distanceBtoC)&&(distanceAtoB==distanceAtoC)&&(distanceBtoC!=distanceAtoC))) && ((distanceAtoB!=0) && (distanceBtoC!=0) && (distanceAtoC!=0)))
{ // this is the normal use of the formula to find the answer.
			
			greatestDistance = Math.max(distanceAtoB, Math.max(distanceBtoC, distanceAtoC));
			sumOfSmallerDistances = (distanceAtoB + distanceBtoC + distanceAtoC - greatestDistance);
			
			System.out.println ("The distance between Point A and B is " +distanceAtoB);
			System.out.println ("The distance between Point B and C is " +distanceBtoC);
			System.out.println ("The distance between Point A and C is " +distanceAtoC);
			System.out.println("The maximum distance is " + greatestDistance);
			System.out.println("The sum of the other two distances is "+sumOfSmallerDistances);
		}
		
	}

}
