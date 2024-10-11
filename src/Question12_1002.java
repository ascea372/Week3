import java.util.Scanner;
public class Question12_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int num = sc.nextInt();
        int i=2;
        boolean isPrime = true;

        System.out.println(isPrime);

        if(num < 2){
            isPrime = false;}
        else{
            while( i < (num/2) ){
                System.out.println( i );
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        System.out.println("결과 : " + i + ", 소수 여부 : " + isPrime );
    }
}
