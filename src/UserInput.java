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
                int input;
                if (i == 0) {
                    System.out.println("Enter the first number in row " + j+1 + ":");
                    input = Integer.parseInt(scanner.nextLine());
                }else{
                    System.out.println("Enter the next number in row "+j+1+":");
                    input = Integer.parseInt(scanner.nextLine());
                }
                matrix[j][i]=input;
            }
        }
        return matrix;
    }
}
