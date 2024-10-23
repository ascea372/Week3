public class Question10_1023 {
    public static void main(String[] args) {
        int[] num = {20, 30, 50, 70, 90};
        int sum=0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("요소의 평균: " + sum/5);
    }
}
