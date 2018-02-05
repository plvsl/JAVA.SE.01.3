import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, h;

        do {
            System.out.println("Enter initial number of the segment:");
            a = sc.nextInt();

            System.out.println("Enter final number of the segment:");
            b = sc.nextInt();

            System.out.println("Enter step value:");
            h = sc.nextInt();

            if (checkParameters(a, b, h)) {
                System.out.println("Incorrect! Enter parameters again!");
                System.out.println("--------------------------------------");
            }

        } while (checkParameters(a, b, h));


        System.out.println("Argument | Function");
        System.out.println("--------------------");

        for (int i = a; i <= b; i += h) {
            double f = functionCounter(i);
            System.out.println(String.format("%-8d | %f", i, f));
        }
    }

    private static double functionCounter(int i) {
        return (Math.tan(2 * i)) - 3;
    }

    private static boolean checkParameters(int a, int b, int h) {
        return ((a > b) || ((b - a) < h) || (a == 0 && b == 0 && h == 0));
    }
}
