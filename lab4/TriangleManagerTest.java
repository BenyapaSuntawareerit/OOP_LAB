package lab4;

public class TriangleManagerTest {
    public static void main(String[] args) {
        TriangleManager manager = new TriangleManager(true);

        Triangle t1 = new EquilateralTriangle(5.0);
        Triangle t2 = new RightTriangle(3.0, 4.0, 5.0);
        Triangle t3 = new EquilateralTriangle(10.0);

        manager.addTriangle(t1);
        manager.addTriangle(t2);
        manager.addTriangle(t3);

        Triangle largest = manager.findTriangleWithLargestPerimeter();

        System.out.println("Largest Perimeter: " + largest.getPerimeter());
        System.out.println("Longest Side: " + largest.getLongestSideLength());
        System.out.println("Largest Angle: " + largest.getLargestAngle());

        try {
            manager.addTriangle(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

