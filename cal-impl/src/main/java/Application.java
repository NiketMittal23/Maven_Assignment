import java.util.Scanner;
 public final class Application {
    private Application() {

    }
    /**
     * @param args main class
     */
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the task");
        System.out.println("1. ADD  2. SUB  3. MUL  4.  DIV");
        int operation = input.nextInt();
        System.out.println("Enter two numbers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        final int multi = 3;
        final int max = 4;
        Calculator calc = new Calculator();
        if (operation == 1) {
            calc.add(number1, number2);

        } else if (operation == 2) {
            calc.sub(number1, number2);

        } else if (operation == multi) {
            calc.mul(number1, number2);

        } else if (operation == max) {
            calc.div(number1, number2);

        } else {
            System.out.println("Wrong operation");
        }
    }
}