class Rectangle {
   double height;
   double width;
   Rectangle(){
       height = -1;
       width = -1;
   }
   Rectangle(double newHeight, double newWidth){
       height = newHeight;
       width = newWidth;
   }
   double getArea(){
       return Math.round(height * width * 10) / 10.0;
   }
   double getPerimeter(){
       return Math.round((2 * height + 2 * width) * 10) / 10.0;
   }
   public static void main (String[]args){
       Rectangle rectangle1 = new Rectangle(4, 40);
       Rectangle rectangle2 = new Rectangle(3.5, 35.9);
       System.out.println("Параметры прямоугольника 1: \nВысота: " + rectangle1.height +
               "\nШирина: " + rectangle1.width + "\nПлощадь: " +
               rectangle1.getArea() + "\nПериметр: " + rectangle1.getPerimeter() + ".\n");
       System.out.println("Параметры прямоугольника 2: \nВысота: " + rectangle2.height +
               "\nШирина: " + rectangle2.width + "\nПлощадь: " +
               rectangle2.getArea() + "\nПериметр: " + rectangle2.getPerimeter() + ".\n");
   }
}
