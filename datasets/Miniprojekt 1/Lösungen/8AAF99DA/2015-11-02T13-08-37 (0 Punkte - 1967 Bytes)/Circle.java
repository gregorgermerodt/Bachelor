/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		location=initLocation;
		radius=initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius=newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location=newLocation;
		
	}
	
	// Durchmesser
	public double getDiameter() {
		double Diameter =2*radius;
		return Diameter;
	}

	// Umfang
	public double getCircumference() {
		double Umfang=Math.PI*2*radius;
		
		return Umfang;
	}

	// Fläche
	public double getArea() {
		double Fläche=Math.PI*radius*radius;
		return Fläche;
	}

	public boolean containsPoint(Point point) {
	
		Point pointO = new Point(0.0, 0.0);
          if(pointO.getDistance(point)<=radius){
        	  return true;
        	  }else{
		return false;
	}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
// An dieser Stelle das circle-Objekt bearbeitet
		return circle;
	}

}
