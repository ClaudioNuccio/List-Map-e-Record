public class Main {
    public static boolean areTheyDifferent(int x, int y) {
        boolean result = true;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        if (x != y) {
            System.out.println(result);
            return result;
        } else {
            result = false;
            System.out.println(result);
            return result;
        }
    }

    public static void main(String[] args) {
        areTheyDifferent(3, 6);
    }
}
