import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("");

        long firstNumber = Long.parseLong(line[0]);
        long secondNumber = Long.parseLong(line[2]);
        switch (line[1]) {
            case "+":
                sumTwoNumbers(firstNumber, secondNumber);
                break;
            case "-":
                subtractTwoNumbers(firstNumber, secondNumber);
                break;
            case "/":
                divideTwoNumbers(firstNumber, secondNumber);
                break;
            case "*":
                multiplyTwoNumbers(firstNumber, secondNumber);
                break;
            default:
                break;
        }
    }
    // Implement your methods here

    public static void subtractTwoNumbers(long a, long b) {
        System.out.println(a - b);
    }


    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
    }


    public static void divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.println("Division by 0!");
        } else {
            System.out.println(a / b);
        }
    }


    public static void multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
    }
}