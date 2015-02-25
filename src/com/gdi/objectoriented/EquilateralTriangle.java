package com.gdi.objectoriented;

public class EquilateralTriangle extends Triangle {

    private EquilateralTriangle() {
        super(0, 0, 0);
    }

    public EquilateralTriangle(int legLength) {
        super(legLength, legLength, legLength);
    }

    @Override
    public int calculateArea() {
        // a^2 + b^2 + c^2 / 4 sqrt(3)
        double neumerator = 3 * (legALength * legALength);
        double denominator = 4 * Math.sqrt(3);
        return Double.valueOf(neumerator / denominator).intValue();
    }
}
