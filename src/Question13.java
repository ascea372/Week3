import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자");
        int first = sc.nextInt();
        System.out.println("두 번째 숫자");
        int second = sc.nextInt();
        System.out.println("세 번째 숫자");
        int third = sc.nextInt();
        System.out.print("연산자 1(+, -, *, /): ");
        String operation1 = sc.next();
        System.out.print("연산자2(+, -, *, /): ");
        String operation2 = sc.next();

        switch(operation1) {
            case "*":
                switch (operation2) {
                    case "+":
                        System.out.print((first * second) + third);
                    case "-":
                        System.out.print((first * second) - third);
                    case "*":
                        System.out.print(first * second * third);
                    case "/":
                        System.out.print((first * second) / third);
                }
            case "/":
                switch (operation2) {
                    case "+":
                        System.out.print((first / second) + third);
                    case "-":
                        System.out.print((first / second) - third);
                    case "*":
                        System.out.print((first / second) * third);
                    case "/":
                        System.out.print((first / second) / third);
                }
            case "+":
                 switch (operation2) {
                     case "*":
                          System.out.print((second * third) + first);
                     case "/":
                           System.out.print((second / third) + first);
                     case "-":
                           System.out.print(first + second - third);
                     case "+":
                           System.out.print(first + second + third);
                        }
            case "-":
                 switch (operation2) {
                     case "+":
                           System.out.print(first - second + third);
                     case "-":
                           System.out.print(first - second - third);
                     case "*":
                           System.out.print(first + (second * third));
                     case "/":
                           System.out.print(first - (second / third));
                        }
                }
    }
}
