package com.gdi.exercise4;

public class VariablePlayground {

    private final int mustBeSetNumber;
    private final int alreadySetNumber = 3;

    public static int thatStaticInt = 0;

    public int myClassInt = 4;

    private VariablePlayground() {
        mustBeSetNumber = 4;
    }

    public static VariablePlayground newInstance() {
        return new VariablePlayground();
    }

    private void incrementMyClassInt() {
        myClassInt++;
    }

    public int incrementAndGetMyInt() {
        incrementMyClassInt();
        return myClassInt;
    }


}
