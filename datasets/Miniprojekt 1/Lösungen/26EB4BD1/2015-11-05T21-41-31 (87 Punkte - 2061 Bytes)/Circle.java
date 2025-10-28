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
    this.location = initLocation;
    this.radius = initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return (radius * 2);
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*(2*radius);
	}

	// Fläche
	public double getArea() {
		return radius*radius*Math.PI;
	}

	public boolean containsPoint(Point point) {
      double radiusp;
      radiusp = (point.getX() - location.getX()) * (point.getX() - location.getX()) + (point.getY() - location.getY()) * (point.getY() - location.getY());
      if(radius>radiusp){
    	 return true; 
      } else {
    	  return false;
      }
      
  }

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
        circle.setLocation(center);
	    circle.setRadius(p.getDistance(p));

		return circle;
	}

}
