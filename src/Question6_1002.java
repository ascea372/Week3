import java.util.Scanner;
public class Question6_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int b = sc.nextInt();

        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        System.out.println("최대공약수 는 : " + a);
    }
}
