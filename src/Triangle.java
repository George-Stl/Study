public class Triangle extends GeometricObject{
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
    public Triangle(){
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        double semiPerimeter = (this.side1 + this.side2 +
                this.side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - this.side1) *
                (semiPerimeter - this.side2) * (semiPerimeter - this.side3));
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    public String toString(){
        return super.toString() + " сторона1 = " + side1 +
                " сторона2 = " + side2 + " сторона3 = " + side3;
    }

    public static void main(String[] args) {
        System.out.println("Введите три стороны треугольника: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Введите цвет треугольника: ");
        String color = input.next();
        System.out.println("Введите заливку треугольника (true, false): ");
        boolean filled = input.nextBoolean();
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println();
        System.out.println("Тругольник " + triangle.toString() +
                "\nПлощадь: " + triangle.getArea() +
                "\nПериметр: " + triangle.getPerimeter());

    }
}
