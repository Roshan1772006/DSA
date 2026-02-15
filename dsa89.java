public class dsa89 {

    // Method 1: Add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method 3: Multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method 4: Check if number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method 5: Display message
    public static void displayMessage(String message) {
        System.out.println(message);
    }

    // Main Method
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        displayMessage("Addition: " + add(num1, num2));
        displayMessage("Subtraction: " + subtract(num1, num2));
        displayMessage("Multiplication: " + multiply(num1, num2));

        if (isEven(num1)) {
            displayMessage(num1 + " is Even");
        } else {
            displayMessage(num1 + " is Odd");
        }
    }
}
