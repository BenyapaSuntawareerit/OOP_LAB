package lab4;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new EquilateralTriangle(5.0);

        System.out.println("Equilateral Triangle");
        System.out.println("Longest Side: " + t1.getLongestSideLength());
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Largest Angle: " + t1.getLargestAngle());

        System.out.println();

        Triangle t2 = new RightTriangle(3.0, 4.0, 5.0);

        System.out.println("Right Triangle");
        System.out.println("Longest Side: " + t2.getLongestSideLength());
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.println("Largest Angle: " + t2.getLargestAngle());
    }
}

