 1 /**
   2  * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
   3  * y-Wert
   4  */
   5 public class Point {
   6
   7     // Koordinaten
   8     private double x;
   9     private double y;
  10
  11     public Point() {
  12     }
  13
  14     public Point(double initX, double initY) { 
  15         this.x = initX;
  16         this.y = initY;
  17     }
  18
  19     public double getX() {
  20         return x;
  21     }
  22
  23     public void setX(double XX) {
  24         this.x = XX;
  25     }
  26
  27     public double getY() {
  28         return y;
  29     }
  30
  31     public void setY(double YY) {
  32         this.y = YY;
  33     }
  34
  35     public double getDistance(Point p) {
  36         Math.sqrt((p.getX()-x)* (p.getX()-x) +(p.getY()-y)*(p.getY()-y));
  37     }
  38 }