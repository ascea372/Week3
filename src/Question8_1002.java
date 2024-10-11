import java.util.Scanner;
public class Question8_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j=0;
        for (i=1; i<=100; i++) {
            if (i%2 != 0) {
                j = j + i;
            }
        }
        System.out.println(j);
    }
}
