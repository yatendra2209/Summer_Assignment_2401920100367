interface test {
    int square(int number);
}

class arithmetic implements test {
    @Override
    public int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        arithmetic arithmeticObject = new arithmetic();

        int number = 5;
        System.out.println("Square of " + number + " is " + arithmeticObject.square(number));
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        arithmetic arithmeticObject = new arithmetic();

        int number = 5;
        System.out.println("Square of " + number + " is " + arithmeticObject.square(number));
    }
}
