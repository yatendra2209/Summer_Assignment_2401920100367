class Box {
    protected int length;
    protected int breadth;

    public Box() {
        length = 0;
        breadth = 0;
    }

    public Box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}

class Box3D extends Box {
    private int height;

    public Box3D() {
        super();
        height = 0;
    }

    public Box3D(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume() {
        return length * breadth * height;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box(10, 5);
        System.out.println("Area of box: " + box.area());

        Box3D box3d = new Box3D();
        box3d.setLength(10);
        box3d.setBreadth(5);
        box3d.setHeight(4);

        System.out.println("Area of box3d base: " + box3d.area());
        System.out.println("Volume of box3d: " + box3d.volume());
    }
}
