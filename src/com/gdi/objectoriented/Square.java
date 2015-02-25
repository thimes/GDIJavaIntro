package com.gdi.objectoriented;

public class Square extends Rectangle {

    private Square() {
        this(0);
    }

    public Square(int lengthOfSide) {
        super(lengthOfSide, lengthOfSide);
    }

    @Override
    public boolean isEquilateral() {
        return true;
    }
}
