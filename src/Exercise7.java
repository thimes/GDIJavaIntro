/**
 * Created by thimes on 2/25/15.
 */
public class Exercise7 {

    public static void main(String[] args) {
        System.out.println(findFibNumber(6));
    }

    private static int findFibNumber(int i) {
        if (i < 2) {
            return 1;
        } else {
            return findFibNumber(i - 1) + findFibNumber(i - 2);
        }
    }

}
