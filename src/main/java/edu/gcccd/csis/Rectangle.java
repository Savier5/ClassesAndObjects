package edu.gcccd.csis;

public class Rectangle {
    private double width;
    private double height;
    private static long numOfRectangles;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    private static long numOfRectangles() {
        numOfRectangles = 0;
        Rectangle.numOfRectangles++;
        return numOfRectangles;
    }
    public void setWidth(double w) {
        width = w;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double h) {
        height = h;
    }
    public double getHeight() {
        return height;
    }
    public double getArea() {
        return width * height;
    }
    public double getCircumference() {
        return 2 * height + 2 * width;
    }
    public boolean isSquare() {
        if (height == width) {
            boolean answer = true;
            System.out.println(true);
            return true;

        } else {
            boolean answer = false;
            System.out.println(false);
            return false;
        }
    }




















}
