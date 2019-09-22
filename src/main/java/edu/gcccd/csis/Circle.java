package edu.gcccd.csis;

public class Circle {
    private double radius;
    private String color;
    private static long numOfCircles;
    private double circle;

    public Circle(double radius, String color){
        radius = 1;
        radius = radius;
        color = color;
    }
    private static long numOfCircles() {
        numOfCircles = 0;
        Circle.numOfCircles++;
        return numOfCircles;
    }
    public void setColor(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        this.circle = (Math.PI) * radius * radius;
        return circle;
    }
    public double getCircumference() {
        this.circle = 2 * (Math.PI) * radius;
        return circle;
    }
}
