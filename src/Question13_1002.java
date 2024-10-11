import java.util.Scanner;
public class Question13_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 1234;
        int player;
        do {
            System.out.print("비밀번호 입력: ");
            player = sc.nextInt();
        } while (player != password);
    }
}
