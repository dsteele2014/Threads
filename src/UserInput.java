import java.util.Scanner;

public class UserInput{
    Scanner scanner = new Scanner(System.in);
    String regex = "\\d+";

    public int[][] fillMatrix(){
        String colLength = inputHeight("Enter the height of the Matrix:");
        while(!colLength.matches(regex)){
            System.out.println("Invalid input.");
            colLength = inputHeight("Enter the height of the Matrix:");
        }
        String rowLength = inputHeight("Enter the length of the Matrix:");
        while(!rowLength.matches(regex)){
            System.out.println("Invalid input.");
            rowLength = inputHeight("Enter the length of the Matrix:");
        }

        int [][] matrix = new int[Integer.parseInt(colLength)][Integer.parseInt(rowLength)];
        for(int j = 0; j<Integer.parseInt(colLength); j++) {
            for (int i = 0; i < Integer.parseInt(rowLength); i++) {
                String input = inputHeight("Enter the number at [" + j + ", "+i+"]:");
                while(!input.matches(regex)){
                    System.out.println("Invalid input.");
                    input = inputHeight("Enter the number at [" + j + ", "+i+"]:");
                }
                matrix[j][i]=Integer.parseInt(input);
            }
        }
        System.out.println("The matrix you input is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    public String inputHeight(String text){
        System.out.println(text);
        String colLength = scanner.nextLine();
        return colLength;
    }
}
