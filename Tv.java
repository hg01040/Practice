public class Tv {
    public String lg;
    public int year;
    public int size;

    public Tv(String lg, int year, int size) {
        this.lg = lg;
        this.year = year;
        this.size = size;
    }
    public void show() {
        System.out.println(lg + "에서 만든 " + year + "년형 " + size + "인치 Tv");
    }
    public static void main(String[] args) {
        Tv myTV = new Tv("LG", 2017, 32);
        myTV.show();
    }
}
