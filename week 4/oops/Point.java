public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point point1 = new Point();
        point1.display();

        Point point2 = new Point(10, 20);
        point2.display();

        point1.setX(5);
        point1.setY(15);
        point1.display();

        point1.setXY(25, 35);
        point1.display();
    }
}