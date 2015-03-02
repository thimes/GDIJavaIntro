public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }


            switch (i % 2) {
                case 0:
                    System.out.println("even");
                    break;
                default:
                    System.out.println("odd");
                    break;
            }


        }
    }
// TODO: print the numbers between 1 and 20
// - inclusive (1, 2..., 19, 20)

// if the number is evenly divisible by 3,
// instead print "fizz"

// if the number is evenly divisible by 5,
// instead print "buzz"

// if the number is evenly divisible by 3 and 5,
// instead print "fizzbuzz"

// 5 % 5 = 0
// 6 % 5 = 1
// 7 % 5 = 2
    //  http://bit.ly/gdi-java
// ex:
// 1
// 2
// fizz
// 4
// buzz

}
