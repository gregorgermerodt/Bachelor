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
        radius = initRadius;
        location = initLocation;

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
        return radius * radius ;
    }

    // Umfang
    public double getCircumference() {
        return Math.PI*(radius*radius);
    }

    // Fl�che
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public boolean containsPoint(Point point) {

        if (location.getDistance(point) > radius) {
            return false;
        }

            return true;
        }


    public static Circle fromPoints(Point center, Point p) {
        Circle circle = new Circle();

        circle.setLocation(center);
        circle.setRadius(center.getDistance(p));
        return circle;


    }

}
