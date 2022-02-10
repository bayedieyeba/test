public class Test {
    static boolean multipleTrois(int n) {
        if (n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean multipleCinq(int n) {
        if (n % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean multipleCinqEtTrois(int n) {
        if ((n % 3 == 0) && (n % 5 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (multipleTrois(i) && !multipleCinqEtTrois(i)) {
                System.out.println("Fizz");
            } else if (multipleCinq(i) && !multipleCinqEtTrois(i)) {
                System.out.println("Buzz");
            } else if (multipleCinqEtTrois(i)) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}