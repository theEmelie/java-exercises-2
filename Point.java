/*
* Date: 2021-09-08.
* File Name: Point.Java
* Author: Emelie 흒lund
*
*/

package ea224qb_assign1;

/**
* Class Description: This class is testing different point values.
*
* @version 1.0 Sept 08
* @author Emelie 흒lund
*/
public class Point {
	int x = 0;
	int y = 0;
	
	/**
	* Method Description: This method stores x and y as 0.
	*
	* @author Emelie 흒lund
	*/
	public Point() {
		x = 0;
		y = 0;
	}
	
	/**
	* Method Description: This method takes x (i) and y (j) as parameters.
	*
	* @author Emelie 흒lund
	*/
	public Point (int i, int j) {
		x = i;
		y = j;
	}
	
	/**
	* Method Description: This method returns the points (x, y) as a string.
	*
	* @author Emelie 흒lund
	*/
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	/**
	* Method Description: This method compares if x and y is the same.
	*
	* @author Emelie 흒lund
	*/
	public boolean isEqualTo(Point p) {
		if (p.x == x && p.y == y) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	* Method Description: This method measures the distance between two points (x,y).
	*
	* @author Emelie 흒lund
	*/
	public double distanceTo(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
	}
	
	/**
	* Method Description: This method moves the points in certain steps.
	*
	* @author Emelie 흒lund
	*/
	public void move(int a, int b) {
		x = x + a;
		y = y + b;
	}
	
	/**
	* Method Description: This method provides a new set of a coordinates.
	*
	* @author Emelie 흒lund
	*/
	public void moveToXY(int a, int b) {
		x = a;
		y = b;
	}

	/**
	* Method Description: This method runs/tests all the previous methods.
	*
	* @author Emelie 흒lund
	*/
	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point(3,4);
		
		System.out.println(p1.toString()); // ==> (0,0)
		System.out.println(p2.toString()); // ==> (3,4)
		
		if (p1.isEqualTo(p2)) { // False!
			System.out.println("The two points are equal");
		}
		
		double dist = p1.distanceTo(p2);
		System.out.println("Point Distance: "+dist);
		p2.move(5,-2); // ==> (8,2)
		p1.moveToXY(8,2); // ==> (8,2)
		
		if (p1.isEqualTo(p2)) { // True!
			System.out.println("The two points are equal");
		}

	}

}
