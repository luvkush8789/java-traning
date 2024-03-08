public class Area {
    public static void main(String[] args) {
        shape obj = new shape();
        obj.Area();
        obj.Area(4, 5);
        obj.Area(3);
        obj.Area(5.67);

    }

}

class shape {
    void Area() {
        System.out.println("Area");
    }

    void Area(float l, int b) {
        System.out.println("rectangle of area " + (l * b));
    }

    void Area(int s) {
        System.out.println("area of square " + (s * s));
    }

    void Area(double r) {
        System.out.println("area of circle : " + 3.14 * r * r);
    }

}