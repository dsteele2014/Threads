import java.util.Scanner;

public class UserInput{

    public int[][] fillMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the Matrix:");
        int colLength = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the length of the Matrix:");
        int rowLength = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[colLength][rowLength];
        for(int j = 0; j<colLength; j++) {
            for (int i = 0; i < rowLength; i++) {
                int row = j+1;
                int input;
                System.out.println("Enter the number at [" + j + ", "+i+"]:");
                input = Integer.parseInt(scanner.nextLine());

                matrix[j][i]=input;
            }
        }
        System.out.println("The matrix you input is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            System.out.println();
        }
        return matrix;
    }
}
