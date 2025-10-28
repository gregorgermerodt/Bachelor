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
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

   // Koordinaten
   private double x;
   private double y;

   public Point() {
   }

   public Point(double initX, double initY) {
      this.x = initX;
      this.y = initY;
   }

   public double getX() {
      return x;
   }

   public void setX(double newX) {
      this.x = newX;
   }

   public double getY() {
      return y;
   }

   public void setY(double newY) {
      this.y = newY;
   }

   public double getDistance(Point p) {
      return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + (Math.pow(this.getY() - p.getY(), 2)));
   }
}
