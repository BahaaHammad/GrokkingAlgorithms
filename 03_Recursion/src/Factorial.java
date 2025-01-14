public class Factorial {

    private static int fact(int x) {
        if (x == 1) { //Base Case
            return 1;
        } else {
            return x * fact(x - 1); // Recursive Case
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
