import java.util.Scanner; // scanner 쓸 때 import문 필수

public class WhileSample {
    public static void main(String[] args) {
        int count=0; // 입력된 정수 개수
        int sum=0; // 정수 합

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");

        int n = scanner.nextInt(); // 정수 입력
        while (n != -1) { // 입력된 정수가 -1과 같지 않으면 While 반복문 반복
            sum += n; // while문 반복되는 동안 입력된 정수들 더해짐
            count++; // while문 반복되는 동안 정수 입력 될때마다 반복
            n = scanner.nextInt(); // 정수 입력
        }
        if (count == 0) // 조건문 if else 정수 개수가 0이면 출력
            System.out.println("입력된 수가 없습니다.");
        else {
            System.out.println("정수의 개수는 " + count + "개입니다"); // if문이 아니라면 출력
            System.out.println("평균은 " + (double)sum/count + "입니다.");
        }
        scanner.close();
    }
}
