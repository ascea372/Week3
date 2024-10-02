import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("키를 입력하세요: ");
        int tall = sc.nextInt();
        System.out.print("몸무게를 입력하세요: ");
        int weight = sc.nextInt();
        float tall2 = tall << 2;

        float bmi = weight/tall2;

        if (bmi < 18.5) {
            System.out.println("저체중입니다.");
        }
        else if (18.5 <= bmi && bmi <= 24.9) {
            System.out.println("정상입니다.");
        }
        else if (25 <= bmi && bmi <= 29.9) {
            System.out.println("과체중입니다.");
        }
        else if (bmi >= 30) {
            System.out.println("비만입니다.");
        }
    }
}
