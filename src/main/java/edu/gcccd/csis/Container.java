package edu.gcccd.csis;

public class Container {

    private Circle rectangle;
    private Circle circle;

    public static void main(String[] args) {
        Circle radiusAndColor = new Circle(0, null);
        System.out.println("The radius of the circle is "+ radiusAndColor.getRadius() + " and color is " + radiusAndColor.getColor());
        Rectangle widthAndHeight = new Rectangle(0, 0);
        System.out.println("The width of the circle is " + widthAndHeight.getWidth() + " and height is " + widthAndHeight.getHeight());
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

    public int size() {
        if (rectangle == null && circle == null)
            System.out.println("0");
        if (rectangle != null && circle == null || rectangle == null && circle != null)
            System.out.println("1");
        if (rectangle != null && circle != null)
            System.out.println("2");
        return size();
    }
}
