/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

    // Mittelpunkt des Kreises
    private Point location;
    private double radius;

    public Circle() {
        radius = 10;
        
    
    }

    public Circle(Point initLocation, double initRadius) {
        location = initLocation;
        radius = initRadius;

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
        return 2*radius;
    }

    // Umfang
    public double getCircumference() {
        return Math.PI*radius*2;
    }

    // Fläche
    public double getArea() {
        return Math.PI*radius*radius;
    }

    public boolean containsPoint(Point point) {
        double a = Math.sqrt(               (point.getX()- location.getX())*(point.getX()-location.getX()) + (point.getY()-location.getY())*(point.getY()-location.getY()    )     );
        
        if ( a<=radius) {
           return true; 
        }
        else {
           return false; 
        }
    }

    public static Circle fromPoints(Point center, Point p) {
        
        double a = Math.sqrt(               (p.getX() - center.getX())*(p.getX()-center.getX()) + (p.getY()-center.getY())*(p.getY()-center.getY()    )     );
        Circle circle = new Circle();
        Point location = center;
        double radius = a;
        

        // An dieser Stelle das circle-Objekt bearbeiten

        return circle;
    }

}
