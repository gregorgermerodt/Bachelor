
public class Circle {
	private Point location;
	private double radius;
	
	public Circle(){
		}
	public Circle(Point initLocation, double initRadius){
		location = initLocation;
		radius = initRadius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	public Point getLocation(){
		return location;
	}
	
	public void setLocation(Point newLocation){
		location = newLocation;
	}
	public double getDiameter(){
		return radius*2;
		
	}
	public double getCircumference(){
		return getDiameter()* Math.PI;
	}
	public double getArea(){
		return Math.PI*Math.pow(radius, 2);
	}
	public boolean containsPoint (Point point){
		boolean ergebnis = false;
		if(point.getDistance(location)<= radius)
		ergebnis = true;
		return ergebnis;
	}
	public static Circle fromPoints (Point center, Point p){
		Circle circle = new Circle ();
		
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));
		return circle;
	}
	}


