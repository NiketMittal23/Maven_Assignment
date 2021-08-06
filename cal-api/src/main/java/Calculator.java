public class Calculator {
    /**
     * @param number1
     * @param number2
     */
    void add(final int number1, final int number2) {
        int sum;
        sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }

    /**
     * @param number1
     * @param number2
     */
    void sub(final int number1, final int number2) {
        int sub;
        sub = number1 - number2;
        System.out.println("The sub is: " + sub);
    }

    /**
     * @param number1
     * @param number2
     */
    void mul(final int number1, final int number2) {
        int mul;
        mul = number1 * number2;
        System.out.println("The mul is: " + mul);
    }

    /**
     * @param number1
     * @param number2
     */
    void div(final double number1, final double number2) {
        double div;
        div = number1 / number2;
        System.out.println("The div is: " + div);
    }
}