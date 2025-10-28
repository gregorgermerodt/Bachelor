/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		location = initLocation;
		radius = initRadius;
		
		//BEARBEITEN AMK

	}

	public double getRadius() {
		return radius;
		
		//-1.0 wegen radius suchen in radius �ndern amkkkkkkkkkkkkkkkkkkkkkkkkk
	}

	public void setRadius(double newRadius)
	{radius= newRadius; 
	
	//DAS �NDERN AMKKKKKKKKKKKKKKK
	}

	public Point getLocation() {
		
		return location;
		
		//NEW POINT �NDERN IN DAS HIER AMk
		
	}

	public void setLocation(Point newLocation) {
		location = newLocation; 
		
		//�NDERN AMK CCCCCCCCCCCCCCCCCC
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius*2 ;
		
		//////////AMKKKKKKKKKKKKKKKKKK BERECHNEN VON DIAMETER DURCHMESSER AMKKKKKKKK
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter() ;
		
		//////AUSRECHNUNG VON DEM BOK F�R UMFANG *2*radius
	}

	// Fl�che
	public double getArea() {
		return Math.pow(Math.PI*radius, 2);
	}

	public boolean containsPoint(Point point) {
	 if (location.getDistance(point)>=radius)
	 
	 {return false; 
	 
	
	 }else{
		 return true; 
		 
		 
		 //BEARBEITEN IF ELSE amk
	 }
	 
	 
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		circle.setLocation(center);
		circle.setRadius (center.getDistance(p));
		return circle;
	}

}
