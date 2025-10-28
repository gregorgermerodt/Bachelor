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
		location = initLocation;
		radius = initRadius;
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
		return 2 * getRadius();
	}

	// Umfang
	public double getCircumference() {
		return 2 * Math.PI * getRadius();
	}

	// Fläche
	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	public boolean containsPoint(Point point) {
		boolean resultX = false;
		boolean resultY = false;
		boolean result = false;
		double pointX = point.getX();
		double pointY = point.getY();
		
		double mPointX = this.getLocation().getX(); //Mittelpunkt
		double mPointY = this.getLocation().getY(); //Mittelpunkt
		
		double bPointX = mPointX + this.getRadius(); //Grenze für X
		double bPointY = mPointY + this.getRadius(); //Grenze für Y
		
		double minusBPointX = mPointX - this.getRadius(); //neg. Grenze für X
		double minusBPointY = mPointY - this.getRadius(); //neg. Grenze für Y
		
//		if((bPointX >= pointX && pointX >= mPointX) || (bPointX <= pointX && pointX <= mPointX)){
//			resultX = true;
//		}
//		if((bPointY >= pointY && pointY >= mPointY) || (bPointY <= pointY && pointY <= mPointY)){
//			resultY = true;
//		}
		if((pointX <= bPointX) && (pointY >= minusBPointY && pointY <= bPointY)){
			result = true;
		}
		if((pointX <= minusBPointX) && (pointY <= bPointY && pointY >= minusBPointY)){
			result = true;
		}
		if(result == true){
			return true;
		}
		else {
			return false;
		}
//		
//		if(resultX == true && resultY==true){
//			return true;
//		}
//		else{
//			return false;
//		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		//center ist Mittelpunkt
		//p liegt auf Kreisrand
		// An dieser Stelle das circle-Objekt bearbeiten
		double mPointX = center.getX();
		double mPointY = center.getY();

		double pPointX = p.getX();
		double pPointY = p.getY();
		
		double zRadius = mPointX - pPointX;
		
		circle.setRadius(zRadius);
		circle.setLocation(center);
		return circle;
	}
}
