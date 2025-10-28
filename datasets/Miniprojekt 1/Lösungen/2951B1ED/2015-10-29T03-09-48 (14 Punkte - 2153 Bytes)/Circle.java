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
    this.location=initLocation;
    this.radius=initRadius;
  }
  
  public double getRadius() {
    return this.radius;
  }
  
  public void setRadius(double newRadius) {
    this.radius=newRadius;
    }
  
  public Point getLocation() {
    return this.location;
  }
  
  public void setLocation(Point newLocation) {
    this.location=newLocation;
    }
  
  // Durchmesser
  public double getDiameter() {
    double ergebnis=getRadius()*2;
    return ergebnis;
  }
  
  // Umfang
  public double getCircumference() {
    double ergebnis=Math.PI*getDiameter();
    return ergebnis;
  }
  
  // Fläche
  public double getArea() {
    double ergebnis=Math.PI*Math.pow(getRadius(),2);
    return ergebnis;
  }
  
  public boolean containsPoint(Point point) {
    return false;
  }
  
  public static Circle fromPoints(Point center, Point p) {
    Circle circle = new Circle();
    
    // An dieser Stelle das circle-Objekt bearbeiten
    
    return circle;
  }
  
}
