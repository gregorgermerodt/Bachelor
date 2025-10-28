import java.awt.Point;

public class Circle 
{
	
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
		this.radius = newRadius;
		
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * 2 * radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI * (radius * radius);
	}

	public boolean containsPoint(Point point){ 
		
	
		if (location.getDiameter(point) <=radius)            
			return true;
			              
              else 
			 return false;
	}
	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

        circle.setLocation(center);
        circle.setRadius(center.getDiameter(p));
		return circle;
	}

}


