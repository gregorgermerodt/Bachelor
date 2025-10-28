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
		return new Point();
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
		return Math.PI*2*radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		
		double q,r;
		q = Math.pow(location.getX()-point.getX(),2) + Math.pow((location.getY()-point.getY()),2) ;
		r = Math.sqrt(q);
		
		
	
		
	
		if(r>=radius){
			
		return false;
		}else{
			return true;
		}
	}


	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.location= center;
			
		double q,r;
		r= Math.pow(p.getX()-center.getX(),2) + Math.pow((p.getY()-center.getY()),2) ;
		q= Math.sqrt(r);
		
		circle.radius=q;
		
		return circle;
		
	
		
		
	}

}
