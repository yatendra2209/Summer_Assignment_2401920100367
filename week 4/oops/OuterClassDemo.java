class Outer {
    public void display() {
        System.out.println("Display method of outer class");
    }

    class Inner {
        public void display() {
            System.out.println("Display method of inner class");
        }
    }
}

public class OuterClassDemo {
    public static void main(String[] args) {
        Outer outerObject = new Outer();
        outerObject.display();

        Outer.Inner innerObject = outerObject.new Inner();
        innerObject.display();
    }
}