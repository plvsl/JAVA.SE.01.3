public class Main {

    public static void main(String[] args) {
        int a = 1; // Начальное значение
        int b = 21; // Конечное значение
        int h = 4; // Шаг

        System.out.println("Argument | Function");
        System.out.println("--------------------");

        for (int i = a; i < b; i += h) {
            double f = (Math.tan(2 * i)) - 3;
            System.out.println(String.format("%-8d | %f", i, f));
        }
    }
}
