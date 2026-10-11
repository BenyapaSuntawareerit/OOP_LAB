package lab4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TriangleManager {
    private List<Triangle> triangles;

    public TriangleManager(boolean useArrayList) {
        if (useArrayList) {
            triangles = new ArrayList<>();
        } else {
            triangles = new LinkedList<>();
        }
    }

    public void addTriangle(Triangle t) {
        if (t == null) {
            throw new IllegalArgumentException("Triangle cannot be null");
        }
        triangles.add(t);
    }

    public Triangle findTriangleWithLargestPerimeter() {
        if (triangles.isEmpty()) {
            return null;
        }

        Triangle largest = triangles.get(0);

        for (Triangle t : triangles) {
            if (t.getPerimeter() > largest.getPerimeter()) {
                largest = t;
            }
        }
        return largest;
    }
}
