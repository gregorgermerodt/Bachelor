
public class Circle {
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
	
	

	public double getDiameter() {
		return 2*radius;
	}

	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}

	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		if(location.getDistance(point)<=radius){
			return ture;
		}
		else{
		return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));
		

		return circle;

}
