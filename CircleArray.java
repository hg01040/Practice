class _02_Circle {
    int radius;
    public _02_Circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        _02_Circle [] c;
        c = new _02_Circle[5];

        for (int i=0; i<c.length; i++)
            c[i] = new _02_Circle(i);

        for (int i=0; i<c.length; i++)
            System.out.print((int)(c[i].getArea()) + " ");
    }

}
