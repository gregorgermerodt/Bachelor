/**
 * Created by:
 * Institut für Informatik und Wirtschaftsinformatik, Universität Duisburg-Essen
 *
 * For learning purpose only.
 *
 * Solved/Edited by Oppa Hansi. Possible solution - there are other ways to
 * solve these tasks.
 */

//package com.oppahansi.mp.mp1;

/**
 * Definiert einen Kreis ueber einen Radius und einem Mittelpunkt in einem
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
      return radius;
   }

   public void setRadius(double newRadius) {
      this.radius = newRadius;
   }

   public Point getLocation() {
      return location;
   }

   public void setLocation(Point newLocation) {
      this.location = newLocation;
   }

   // Durchmesser
   public double getDiameter() {
      return radius * 2;
   }

   // Umfang
   public double getCircumference() {
      return Math.PI * 2 * getDiameter();
   }

   // Flaeche
   public double getArea() {
      return Math.PI * Math.pow(getRadius(), 2);
   }

   public boolean containsPoint(Point point) {
      return  getDistance(point) < getRadius();
   }

   private double getDistance(Point point) {
      return Math.sqrt(Math.pow(point.getX() - getLocation().getX(), 2) + (Math.pow(point.getY() - getLocation().getY(), 2)));
   }

   public static Circle fromPoints(Point center, Point p) {
      Circle circle = new Circle();

      // An dieser Stelle das circle-Objekt bearbeiten

      circle.setLocation(center);
      circle.setRadius(Math.sqrt(Math.pow(p.getX() - center.getX(), 2) + (Math.pow(p.getY() - center.getY(), 2))));

      return circle;
   }
}
