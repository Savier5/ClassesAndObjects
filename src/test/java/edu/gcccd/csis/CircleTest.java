package edu.gcccd.csis;

import org.junit.Test;

public class CircleTest{


    @Test
    public void getArea() {
        double radius = 10;
        double area;
        area = (Math.PI) * radius * radius;
        System.out.println("The area of of circle with the radius of " + radius + " is " + area);
    }

    @Test
    public void getCircumference() {
        double radius = 10;
        double circumference;
        circumference = 2 * (Math.PI) * radius;
        System.out.println("The circumference of circle with the radius of " + radius + " is " + circumference);
    }
}
