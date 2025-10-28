/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

    // Koordinaten
    private double x;
    private double y;
    private double distance;
    
    
    public Point() {
         
    }

    public Point(double initX, double initY) {      
        
        x = initX;
        y = initY;
            
    }

    public double getX() {
        return x;
    }

    public void setX(double newX) {
        x = newX;
    }

    public double getY() {
        return y;
    }

    public void setY(double newY) {
        y = newY;
    }

    public  double getDistance(Point point) {
        distance = Math.sqrt(               (point.getX()- getX())*(point.getX()-getX()) + (point.getY()-getY())*(point.getY()-getY()    )     );
        System.out.println(distance);
        return distance;
    }
    
    
    
}
