puplic class Circle {
   
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
           return getDiameter()*Math.PI;
       }
   
       // Fl che
       public double getArea() {
           return (Math.PI)*Math.pow(radius, 2);
       }
   
       public boolean containsPoint(Point point) {
           
           boolean PunktLiegtDrin = false;
           
           if(point.getDistance(location) <= radius) {
               
               PunktLiegtDrin = true;
               
           }
           
           return PunktLiegtDrin;
       }
   
       public static Circle fromPoints(Point center, Point p) {
           Circle circle = new Circle();
   
           circle.setLocation(center);
           circle.setRadius(center.getDistance(p));
           
           return circle;
       }
   
   }