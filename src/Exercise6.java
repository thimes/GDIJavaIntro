/**
 * Created by thimes on 2/25/15.
 */
public class Exercise6 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : values) {
            System.out.println(i);
        }

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        i = 0;

        do {
            i++;
            System.out.println(i);
        } while (i <= 10);


    }

}
