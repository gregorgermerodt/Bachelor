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
		
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {
		double a1=0;
		double a2=0;
		double b1=0;
		double b2=0;
		
		if(point.getX()>location.getX()){
			
			a1=point.getX();
			a2=location.getX();
			
		}
		else{
			a1=location.getX();
			a2=point.getX();
		}
		if(point.getY()>location.getY()){
			
			a1=point.getY();
			a2=location.getY();
			
		}
		else{
			a1=location.getY();
			a2=point.getY();
		}
				
		double abstand = Math.sqrt(Math.pow((a1-a2), 2) + Math.pow((b1-b2), 2));
		
		if(abstand<=radius){
			return true;
		}
		else{
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten		
		circle.setLocation(center);
		
		double a1=0;
		double a2=0;
		double b1=0;
		double b2=0;
		
		if(p.getX()>center.getX()){
			
			a1=p.getX();
			a2=center.getX();
			
		}
		else{
			a1=p.getX();
			a2=center.getX();
		}
		if(p.getY()>center.getY()){
			
			a1=p.getY();
			a2=center.getY();
			
		}
		else{
			a1=center.getY();
			a2=p.getY();
		}
				
		double abstand = Math.sqrt(Math.pow((a1-a2), 2) + Math.pow((b1-b2), 2));
		
		circle.setRadius(abstand);
		
		return circle;
	}

}
