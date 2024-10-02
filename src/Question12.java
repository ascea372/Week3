import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 과목: ");
        int lang = sc.nextInt();
        System.out.print("수학 과목: ");
        int math = sc.nextInt();
        System.out.print("사회 과목: ");
        int socity = sc.nextInt();
        System.out.print("과학 과목: ");
        int scinece = sc.nextInt();

        if (lang >= 90) {
            System.out.println("A 학점");
        } else if (lang >= 80) {
            System.out.println("B 학점");
        } else if (lang >= 70) {
            System.out.println("C 학점");
        } else if (lang >= 60) {
            System.out.println("D 학점");
        } else {
            System.out.println("F 학점");
        }

        if (math >= 90) {
            System.out.println("A 학점");
        } else if (math >= 80) {
            System.out.println("B 학점");
        } else if (math >= 70) {
            System.out.println("C 학점");
        } else if (math >= 60) {
            System.out.println("D 학점");
        } else {
            System.out.println("F 학점");
        }

        if (socity >= 90) {
            System.out.println("A 학점");
        } else if (socity >= 80) {
            System.out.println("B 학점");
        } else if (socity >= 70) {
            System.out.println("C 학점");
        } else if (socity >= 60) {
            System.out.println("D 학점");
        } else {
            System.out.println("F 학점");
        }

        if (scinece >= 90) {
            System.out.println("A 학점");
        } else if (scinece >= 80) {
            System.out.println("B 학점");
        } else if (scinece >= 70) {
            System.out.println("C 학점");
        } else if (scinece >= 60) {
            System.out.println("D 학점");
        } else {
            System.out.println("F 학점");
        }

        int average = (lang + math + scinece + socity)/4;
        if (average >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }
}
