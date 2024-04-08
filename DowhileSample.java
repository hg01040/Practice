public class DowhileSample {
    public static void main(String[] args) {
        char c = 'a'; // 변수 c 선언 문자 타입 char a로 초기화

        do { // do while 문 실행 이전에 변수 초기화
            System.out.print(c);
            c = (char) (c + 1); // 영문일때 1을 더하면 다음 문자 코드 값
        } while (c <= 'z'); // z에서 끝
    }
}
