import java.util.Scanner;

public class rspGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >> ");
        String a = scanner.next();
        System.out.print("영희 >> ");
        String b = scanner.next();
        int c =0;
        switch (a) {
            case "가위":
                c = 1; break;
            case "바위":
                c = 2; break;
            case "보":
                c = 3; break;
            default: System.out.println("다시 입력해주세요");
        }
        int d=0;
        switch (b) {
            case "가위":
                d = 1; break;
            case "바위":
                d = 2; break;
            case "보":
                d = 3; break;
            default: System.out.println("다시 입력해주세요");
        }
        switch (c -= d) {
            case 0:
                System.out.println("비겼습니다"); break;
            case -1:
                System.out.println("영희가 이겼습니다"); break;
            case 2:
                System.out.println("영희가 이겼습니다"); break;
            case 1:
                System.out.println("철수가 이겼습니다"); break;
            case -2:
                System.out.println("철수가 이겼습니다"); break;
        }
    }
}
