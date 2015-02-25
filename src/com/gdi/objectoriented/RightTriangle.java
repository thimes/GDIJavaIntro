package com.gdi.objectoriented;

public class RightTriangle extends Triangle {

    private RightTriangle() {
        super(0, 0, 0);
    }

    public RightTriangle(int legALength, int legBLength, int hypotenuseLength) {
        super(legALength, legBLength, hypotenuseLength);
        // important to note that leg C is the hypotenuse, and leg A and B form the right angle
    }

    @Override
    public int calculateArea() {
        return legALength / 2 * legBLength;
    }
}
