/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
import java.util.*;
public class Point {
  
  // Koordinaten
  private double x;
  private double y;
  Point point=new Point();
  
  public Point() {
    
  }
  
  public Point(double initX, double initY) {
    this.x=initX;
    this.y=initY;
  }
  
  public double getX() {
    return this.x;
  }
  
  public void setX(double newX) {
    this.x=newX;
  }
  
  public double getY() {
    return this.y;
  }
  
  public void setY(double newY) {
    this.y=newY;
  }
  
  public double getDistance(Point point, Point p) {
    double d=Math.sqrt(Math.pow(p.x-point.x,2)+Math.pow(p.y-point.y,2));
    return d;
  }
}
