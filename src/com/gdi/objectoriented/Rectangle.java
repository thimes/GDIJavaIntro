package com.gdi.objectoriented;

public class Rectangle extends Shape {

    private final int width;
    private final int length;

    private Rectangle() {
        this(0, 0);
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return length * width;
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }

    @Override
    public boolean isEquilateral() {
        return length == width;
    }
}
