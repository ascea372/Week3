import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력하신 수는 짝수입니다.");
        }

        else {
            System.out.println("입력하신 수는 홀수입니다.");
        }
    }
}
