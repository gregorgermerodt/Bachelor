/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
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
        return radius*2;
    }

    // Umfang
    public double getCircumference() {
        double c = 2*Math.PI*radius;
        return c;
    }

    // Fl�che
    public double getArea() {
        double a = Math.PI*radius*radius;
        return a;
    }

    public boolean containsPoint(Point point) {
        if(location.getDistance(point) <= radius){
            return true;
        }
        
        else {
            return false;
        }
    }

    public static Circle fromPoints(Point center, Point p) {
        Circle circle = new Circle();

        circle.location = center;
        circle.radius = center.getDistance(p);
        
        return circle;
    }

}
