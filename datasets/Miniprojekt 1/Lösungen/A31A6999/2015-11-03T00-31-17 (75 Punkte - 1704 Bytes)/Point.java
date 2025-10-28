
public class Point {


// Koordinaten
private double x;
private double y;

public Point(double initX, double initY) {
	x=initX;
	y=initY;
}

public double getX() {
	return (-1.0); 
}

public void setX(double newX) {
	x=newX;
}

public double getY() {
	return -1.0;
}

public void setY(double newY) {
	y=newY;
}

public double getDistance(Point p) {
	double distX = p.getX()-x;
	double distY = p.getY()-y;
	double distRaw = Math.pow(distX, 2)+ Math.pow(distY,2); 
	double distance = Math.sqrt(distRaw); 
	return distance;
}
} 
