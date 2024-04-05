public class ForSample {
    public static void main(String[] args) {
        int sum =0; // 변수 sum 선언하고 0으로 초기화

        for (int i=1; i<=10; i++) { // for 반복문으로 1~10까지 반복
            sum += i; // sum 은 변수 i 다 실행되서 더해진 총 값 55
            System.out.print(i); // i 출력
            if (i<=9) // if else 조건문 i가 9보다 작거나 같으면 +출력 1+2+ 이런식
                System.out.print("+");
            else { // 아니라면 =sum 출력 => =55
                System.out.print("=");
                System.out.print(sum);
            }
        }
    }
}
