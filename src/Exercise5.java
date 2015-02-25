public class Exercise5 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;


        if (a < b) {
            System.out.println("First if");
        }

        int testValue = 2;

        if (testValue % 2 == 0) {
            System.out.println("it's even!");
        } else {
            System.out.println("it's Odd!");
        }

        int userAge = 16;

        if (userAge < 16) {
            System.out.println("person cannot drive, vote, nor drink");
        } else if (userAge < 18) {
            System.out.println("person can drive, but cannot vote, nor drink");
        } else if (userAge < 21) {
            System.out.println("person can drive and vote but not drink");
        } else {
            System.out.println("person can drive, vote, and drink, but don't do all at once!");
        }


        /*
        if (a < b)
            System.out.println("noCurlies!");
            System.out.println("will I print or not??");
        */

        if (firstCondition(true) && secondCondition(true)) {
            System.out.println("true and true was true!");
        }

        if (firstCondition(true) && secondCondition(false)) {
            System.out.println("true and false was true!");
        }

        if (firstCondition(false) && secondCondition(true)) {
            System.out.println("false and true was true!");
        }

        if (firstCondition(false) && secondCondition(false)) {
            System.out.println("false and false was true!");
        }




        if (firstCondition(true) || secondCondition(true)) {
            System.out.println("true or true was true!");
        }

        if (firstCondition(true) || secondCondition(false)) {
            System.out.println("true or false was true!");
        }

        if (firstCondition(false) || secondCondition(true)) {
            System.out.println("false or true was true!");
        }

        if (firstCondition(false) || secondCondition(false)) {
            System.out.println("false or false was true!");
        }

    }

    private static boolean secondCondition(boolean retVal) {
        System.out.println("second condition is going to return " + retVal);
        return retVal;
    }

    private static boolean firstCondition(boolean retVal) {
        System.out.println("first condition is going to return " + retVal);
        return retVal;
    }
}

