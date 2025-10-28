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

		location= initLocation;
		radius= initRadius;
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
		double Durchmesser=0;
		Durchmesser=radius*2;
		
		return Durchmesser;
	}

	// Umfang
	public double getCircumference() {
		double Umfang=0;
		Umfang=(2*Math.PI*radius);
		
		return Umfang;
	}

	// Fläche
	public double getArea() {
		double Area=0;
		Area=Math.PI*Math.pow(radius, 2);
		return Area;
	}

	public boolean containsPoint(Point point) {
		if (point.getDistance(this.location)<this.getRadius()){
			return true;
			
		}else{
		
		return false;
	}
	}
	public static Circle fromPoints(Point center, Point p) {
		
		double Abstand=0;
		Abstand=Math.sqrt(Math.pow((center.getX()-p.getX()), 2)+(Math.pow((center.getY()-p.getY()), 2)));
		
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.setRadius(Abstand);
		

		return circle;
	}

}
