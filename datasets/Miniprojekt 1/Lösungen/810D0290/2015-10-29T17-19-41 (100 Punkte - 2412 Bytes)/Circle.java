/**
 * Definiert einen Kreis ¸ber einen Radius und einem Mittelpunkt in einem
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

        return this.radius;
    }

    public void setRadius(double newRadius) {

        this.radius = newRadius;
    }

    public Point getLocation() {

        return this.location;
    }

    public void setLocation(Point newLocation) {

        this.location = newLocation;
    }

    // Durchmesser
    public double getDiameter() {

        double result = 0.d;
        result = this.radius * 2;
        return result;
    }

    // Umfang
    public double getCircumference() {

        double result = 0.d;
        result = Math.PI * this.getDiameter();
        return result;
    }

    // Fl‰che
    public double getArea() {

        double result = 0.d;
        result = Math.PI * Math.pow(this.radius, 2);
        return result;
    }

    public boolean containsPoint(Point point) {

        boolean result = false;
        double distance = Math.abs(point.getDistance(this.location));
        if (distance <= this.radius) {
            result = true;
        }

        return result;
    }

    public static Circle fromPoints(Point center, Point p) {

        double radi = center.getDistance(p);

        Circle circle = new Circle(center, radi);

        return circle;
    }

}
