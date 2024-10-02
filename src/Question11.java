import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int second = sc.nextInt();
        System.out.print("세 번째 숫자를 입력하세요: ");
        int third = sc.nextInt();

        if (first > second) {
            if (first > third) {
                System.out.print(first);
            }
            else if (third > first) {
                System.out.print(third);
            }
        }
        if (first < second) {
            if (second < third) {
                System.out.print(third);
            }
            else if (second > third) {
                System.out.print(second);
            }
        }
    }
}
