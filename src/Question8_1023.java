import java.util.Scanner;
public class Question8_1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요: ");
        int k = sc.nextInt();
        int check = 0;
        int[] num = {2, 4, 6, 8, 10};
        for (int i = 0; i < num.length; i++) {
            if (k==num[i]) {
                check=1;
                break;
            }
        }
        if(check==1){
            System.out.println("존재합니다.");
        }
        else{
            System.out.println("존재하지 않습니다.");
        }
    }
}