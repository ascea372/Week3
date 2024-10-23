public class Question5_1023 {
    public static void main(String[] args) {
        int[] num = {12, 3, 19, 7, 5};
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            System.out.print("/i = " + i);
            System.out.print("/min = " + min);
            System.out.print("/num[i] = " + num[i]);
            if (num[i] < min) {
                min = num[i];
            }
            System.out.println();
        }
        System.out.println(min);
    }
}
