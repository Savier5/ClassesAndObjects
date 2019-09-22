package edu.gcccd.csis;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerTest{

    @Test
    public static void main(String[] args) {
        Circle radiusAndColor = new Circle(0, null);
        System.out.println("The radius of the circle is "+ radiusAndColor.getRadius() + " and color is " + radiusAndColor.getColor());
        Rectangle widthAndHeight = new Rectangle(0, 0);
        System.out.println("The width of the circle is " + widthAndHeight.getWidth() + " and height is " + widthAndHeight.getHeight());
    }
    // The size() for some reason will not run if the PSVM is on.
    @Test
    public void size() {
        String rectangle = null;
        String circle = "Something";
        if (rectangle == null && circle == null)
            System.out.println("0");
        if (rectangle != null && circle == null || rectangle == null && circle != null)
            System.out.println("1");
        if (rectangle != null && circle != null)
            System.out.println("2");
    }
}
