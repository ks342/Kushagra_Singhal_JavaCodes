import java.util.Scanner;

class Calculator {
    double a, b;
    String op;

    Calculator(double a, double b, String op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    double calculate() {
        switch (op) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                if (b != 0)
                    return a / b;
                else {
                    System.out.println("not div by 0");
                    return 0;
                }
            default:
                System.out.println("Invalid Operation!");
                return 0;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num a: ");
        double a = sc.nextDouble();

        System.out.println("Enter num b: ");
        double b = sc.nextDouble();

        System.out.println("Enter opn (add/sub/mul/div): ");
        String op = sc.next();

        Calculator c = new Calculator(a, b, op);
        System.out.println("Result: " + c.calculate());
    }
}
