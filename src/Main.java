public class Main {
    public static void main(String[] args) {
        // Test case 1: multiplying the three positive integers
        int results1 = multiplyThreeNumbers(3, 6, 9);
        System.out.println("The result of 3 * 6 * 9 is: " + results1);

        // second test case showing the method work with another set of integers
        int num1 = 7;
        int num2 = 3;
        int num3 = 4;
        int results2 = multiplyThreeNumbers(num1, num2, num3);
        System.out.println("The result of " + num1 + " * " + num2 + " * " + num3 + " is: " + results2);
    }


    public static int multiplyThreeNumbers(int valueA, int valueB, int valueC) {
        int product = valueA * valueB * valueC;
        return product;
    }
}