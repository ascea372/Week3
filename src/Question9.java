import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자: ");
        int first = sc.nextInt();
        System.out.println("두 번째 숫자: ");
        int second = sc.nextInt();
        System.out.println("부호를 입력하세요(+, -, *, /): ");
        String operation = sc.next();

        switch (operation) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                else {
                    System.out.println(first / second);
                    break;
                }
        }
    }
}
