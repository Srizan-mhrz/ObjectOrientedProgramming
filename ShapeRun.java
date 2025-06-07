class Shapes {

    public void calculateArea() {
    }
}

class Rectangles extends Shapes {
    int length;
    int breadth;

    public Rectangles(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println(length * breadth);
    }

    public void calculatePerimerter() {
        System.out.println(2 * (length + breadth));
    }
}

class Circles extends Shapes {
    int radius;

    public Circles(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println(22 / 7 * radius * radius);
    }

    public void calculateCircumference() {
        System.out.println(2 * 22 / 7 * radius);
    }
}

public class ShapeRun {
    public static void main(String[] args) {
        Circles c = new Circles(7);
        c.calculateCircumference();
        c.calculateArea();

        Rectangles r = new Rectangles(4, 5);
        r.calculateArea();
        r.calculatePerimerter();
    }

}