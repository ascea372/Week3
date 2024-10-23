public class Question4_1023 {
    public static void main(String[] args) {
        int[] num = {3, 7, 2, 9, 4};
        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            System.out.print("/i = " + i);
            System.out.print("/max = " + max);
            System.out.print("/num[i] = " + num[i]);
            if (num[i] > max) {
                max = num[i];
            }
            System.out.println();
        }
        System.out.println(max);
    }
}
