public class Question9_1023 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int[] copy = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            copy[i] = num[i];
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(copy[i] + " / " + num[i]);
        }
    }
}
