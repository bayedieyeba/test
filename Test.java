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

    static boolean contientTrois(int n) {
        boolean ok = false;
        String nbChain = Integer.toString(n);
        for (int j = 0; j < nbChain.length(); j++) {
            if (nbChain.charAt(j) == '3') {
                ok = true;
                break;

            }
        }
        return ok;
    }

    static boolean contientCinq(int n) {
        boolean ok = false;
        String nbChain = Integer.toString(n);
        for (int j = 0; j < nbChain.length(); j++) {
            if (nbChain.charAt(j) == '5') {
                ok = true;
                break;
            }
        }
        return ok;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (multipleTrois(i) && !multipleCinqEtTrois(i) || contientTrois(i)) {
                System.out.println("Fizz");
            } else if (multipleCinq(i) && !multipleCinqEtTrois(i) || contientCinq(i)) {
                System.out.println("Buzz");
            } else if (multipleCinqEtTrois(i)) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
