
class Location {
    public int row, column;
    public double maxValue;
    Location(){}
    Location(int methodRow, int methodColumn, double methodMaxValue){
        row = methodRow;
        column = methodColumn;
        maxValue = methodMaxValue;
    }

    public static Location locateLargest(double[][] a){
        double methodMaxValue = a[0][0];
        int methodRow= 0;
        int methodColumn = 0;
        for(int j = 1; j < a[0].length; j++) {
            if (methodMaxValue < a[0][j]) {
                methodMaxValue = a[0][j];
                methodRow = 0;
                methodColumn = j;
            }
        }
        for (int i = 1; i < a.length; i++){
            for(int j = 1; j < a[i].length; j++){
                if(methodMaxValue < a[i][j]){
                    methodMaxValue = a[i][j];
                    methodRow = i;
                    methodColumn = j;
                }
            }
        }

        return new Location(methodRow, methodColumn, methodMaxValue);
    }
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Введите количество строчек и столбцов массива: ");
        int rowInput = input.nextInt();
        int columnInput = input.nextInt();
        double [][] list = new double[rowInput][columnInput];
        System.out.println("Введите массив: ");
        for (int row = 0; row < list.length; row++){
            for (int column = 0; column < list[row].length; column++){
                list[row][column] = input.nextDouble();
            }
        }
        System.out.println("Введенный вами массив: ");
        for (int row = 0; row < list.length; row++){
            for (int column = 0; column < list[row].length; column++){
                System.out.print(list[row][column] + " ");
            }
            System.out.print("\n");
        }
        Location locationOfMax = new Location();
        locationOfMax = locateLargest(list);
        System.out.println("\nНаибольший элемент массива, равный " + locationOfMax.maxValue +
                ", находится в позиции: (" +
                (1 + locationOfMax.row) + ", " + (1 + locationOfMax.column) + ")" );
    }
}




