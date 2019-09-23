package edu.gcccd.csis;

import org.junit.Test;

public class RectangleTest{


    @Test
    public void getArea() {
        double height = 25;
        double width = 10;
        double number;
        number = width * height;
        System.out.println("The area of rectangle with the height of " + height + " and width of " + width + " is " + number);
    }

    @Test
    public void getCircumference() {
        double height = 10;
        double width = 12;
        double number;
        number = 2 * height + 2 * width;
        System.out.println("The circumference of rectangle with the height of " + height + " and width of " + width + " is " + number);
    }

    @Test
    public void isSquare() {
        double height = 25;
        double width = 576;
        if (height == width) {
            boolean answer = true;
            System.out.println(true);

        } else {
            boolean answer = false;
            System.out.println(false);
        }
    }
}
