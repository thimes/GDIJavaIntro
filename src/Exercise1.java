
public class Exercise1 {

    public static void main(String[] args) {

        int i = 0;
        System.out.println(i);

        double priceForACoke = 1;
        double priceForASandwich = 4.99;

        System.out.println(priceForACoke);
        System.out.println(priceForASandwich);


        System.out.println("Total price for lunch = $" + priceForACoke + priceForASandwich);
        // something isn't right, let's fix it!

        double priceForACokeAtDinner = 2 * priceForACoke;
        priceForASandwich = 10.99;

        System.out.println("Total price for dinner = $" + priceForACoke + priceForASandwich);

        boolean isFun = true;
        System.out.println("There is fun being had, right? " + isFun);

        int[] cash5Numbers = {4, 7, 28, 29, 30};
        System.out.println("The cash 5 numbers are : " + cash5Numbers);

        int[] match6Numbers = new int[6];
        match6Numbers[0] = 4;
        match6Numbers[1] = 8;
        match6Numbers[2] = 15;
        match6Numbers[3] = 16;
        match6Numbers[4] = 23;
        match6Numbers[5] = 42;
        System.out.println("The match 6 numbers are : " + match6Numbers);

        System.out.println("The 2nd match 6 number is " + match6Numbers[1]);

        System.out.println("The the last match 6 number is " + match6Numbers[6]);

    }

}
