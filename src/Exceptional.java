/**
 * Created by thimes on 2/28/15.
 */
public class Exceptional {
    public static void main(String[] args) {
        int i = 10;
        try {
            Integer myInt = new Integer("five");
            i = i + myInt;
            System.out.print("i = " + i);
        } catch (NumberFormatException nfe) {
            System.out.print("OH NO");
        } finally {
            System.out.print("finally");
        }

        // massive calculations that need i, and are vital
    }
}
