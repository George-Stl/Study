import java.util.ArrayList;
import java.util.Collections;

public class IllegalTriangleException {
    private double side1;
    private double side2;
    private double side3;
    public IllegalTriangleException(){
        this(3, 3, 3);
    }
    public IllegalTriangleException(double side1, double side2, double side3){
        ArrayList<Double> triangleSides = new ArrayList<>();
        triangleSides.add(side1);
        triangleSides.add(side2);
        triangleSides.add(side3);
        double largestSide = Collections.max(triangleSides);
        triangleSides.remove(largestSide);
        if(largestSide > triangleSides.get(0) + triangleSides.get(1)){
            throw new IllegalArgumentException("Неправильные стороны");
        }

    }
}
