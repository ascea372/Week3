import java.util.Scanner;
public class Calculator {
    // 덧셈
    public double add(double a, double b) {
        return a + b;
    }

    // 뺄셈
    public double subtract(double a, double b) {
        return a - b;
    }

    // 곱셈
    public double multiply(double a, double b) {
        return a * b;
    }

    // 나눗셈
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자: ");
        double a = sc.nextDouble();
        System.out.println("두 번째 숫자: ");
        double b = sc.nextDouble();

        System.out.println("덧셈: " + calculator.add(a, b));
        System.out.println("뺄셈: " + calculator.subtract(a, b));
        System.out.println("곱셈: " + calculator.multiply(a, b));
        System.out.println("나눗셈: " + calculator.divide(a, b));
    }
}
