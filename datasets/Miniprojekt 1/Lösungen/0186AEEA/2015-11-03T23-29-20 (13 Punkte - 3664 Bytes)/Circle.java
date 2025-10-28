public class Circle {
	// Mittelpunkt des Kreises
    private Point location;
    private double radius;


    public Circle(Point initLocation, double initRadius) {
            //location.setX(initLocation.getX());
            //location.setY(initLocation.getY());
            //location = initLocation;
            location = new Point(initLocation.getX(), initLocation.getY());
            radius = initRadius;
            System.out.println("TEST location: x= "+ location.getX() +"y= " + location.getY() + "testX= " + initLocation.getX()+ "testY= "+ initLocation.getY());
            System.out.println("TEST radius: "+ radius + " " + initRadius);

    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public Point getLocation() {
        return this.location;
    }
    
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    
    public void setLocation(Point newLocation) {
        this.location = newLocation;
    }
    
    public double getDiameter() {
        return this.radius * 2;
    }

    public double getCircumference() {
        double range;
        
        range = 2 * Math.PI * this.radius;
        
        return range;
    }
    
    public double getArea() {
        double area;
        
        area = Math.PI * Math.pow(this.radius, 2);
        
        return area;
    }

    public boolean containsPoint(Point point) {
        return ((Math.pow(this.location.getX(), 2)) + (Math.pow(this.location.getY(), 2))< Math.pow(radius, 2));
    }
    
//    public Circle fromPoints(Point center, Point p) {
//        
//    }
    
}
