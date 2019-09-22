package edu.gcccd.csis;

public class Container {

    private Circle rectangle;
    private Circle circle;

    public static void main(String[] args) {
        Circle radiusAndColor = new Circle(6, "Red");
        System.out.println(radiusAndColor);
    }

    public void setRectangle() {
        rectangle = rectangle;
    }

    public Circle getRectangle() {
        return rectangle;
    }

    public void setCircle() {
        circle = circle;
    }

    public Circle getCircle() {
        return circle;
    }

    int size() {
        if (rectangle == null && circle == null)
            System.out.println("0");
        if (rectangle != null && circle == null || rectangle == null && circle != null)
            System.out.println("1");
        if (rectangle != null && circle != null)
            System.out.println("2");
        return size();
    }
}
