public class Ex {
    public static void main(String[] args) {
        Static s1, s2;
        s1 = new Static();
        s1.n = 5;
        s1.g();
        s1.m = 50;
        s2 = new Static();
        s2.n = 8;
        s2.h();
        s2.f();
        System.out.println(s1.m);
    }
}
