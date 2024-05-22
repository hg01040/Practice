import java.util.Random;
import java.util.Scanner;

public class Plusgame {
    public static void main(String[] args) {
        Random a = new Random();
        Scanner scanner = new Scanner(System.in);
        int [] Exam = new int[10];
        int [] Guess = new int[10];
        int [][] wrong = new int[10][2];
        while (true) {
            makeGame(a, scanner, Exam, Guess, wrong);
            printResult(correct, scanner, Exam, Guess, wrong);
            printMistake(scanner, Exam, Guess, wrong);
            System.out.print("다시 시작하시겠습니까?(y/n) >> ");
            if (scanner.next().equals("n")) break;
        }
    }
    public static int makeGame(Random a, Scanner scanner, int[] Exam, int[] Guess, int[][] wrong) {
        int correct = 0;
        int wrongA = 0;
        for (int n = 0; n < Exam.length; n++) {
            int b = a.nextInt(10, 100);
            int c = a.nextInt(10, 100);
            Exam [n] = b + c;
            System.out.println("문제 " + (n + 1));
            System.out.println("값을 맞춰보세요.");
            System.out.print(b + " + " + c + " = " + " ? " + "--> ");
            Guess [n] = scanner.nextInt();
            if (Exam[n] == Guess[n]) {
                correct++;
            }
            else {
                wrong[wrongA][0] = b;
                wrong[wrongA][1] = c;
                wrongA++;
            }
        }
        return correct;
    }
    public static void printResult(int correct, int wrongA, Scanner scanner, int[] Exam, int[] Guess, int[][] wrong) {
        System.out.println("성적 " + correct + "점");
    }
    public static void printMistake(int correct, int wrongA, Scanner scanner, int[] Exam, int[] Guess, int[][] wrong) {
        System.out.println("오답");
        for (int i = 0; i < wrongA; i++) {
            int b = wrong[i][0];
            int c = wrong[i][1];
            int Scorrect = b + c;
            System.out.print(b + " + " + c + " = " + " ? " + "--> ");
            int Second = scanner.nextInt();

            if (Second == Scorrect) {
                System.out.println("통과!");
            }
            else {
                System.out.println("두 번 틀리는건 빡대가리");
            }
        }
    }
}

