package com.gdi.objectoriented;

public abstract class Triangle extends Shape {

    protected final int legALength;
    protected final int legBLength;
    protected final int legCLength;

    public Triangle(int legALength, int legBLength, int legCLength) {
        this.legALength = legALength;
        this.legBLength = legBLength;
        this.legCLength = legCLength;
    }

    public abstract int calculateArea();

    @Override
    public int getNumberOfSides() {
        return 3;
    }

    @Override
    public boolean isEquilateral() {
        return legALength == legBLength && legBLength == legCLength;
    }
}
