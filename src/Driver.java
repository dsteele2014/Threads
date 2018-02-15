public class Driver{
    public static void main(String[]args) {

        UserInput input = new UserInput();
        int[][] matrix1 = input.fillMatrix();
        int[][] matrix2 = input.fillMatrix();
        if (matrix1.length == matrix2[0].length) {
            int[][] matrix3 = new int[matrix1.length][matrix2[0].length];

            final int NUM_THREADS = matrix1.length * matrix2[0].length;
            Thread[] myThreads;
            myThreads = new Thread[NUM_THREADS];

            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    WorkerThread wt = new WorkerThread(i, j, matrix1, matrix2, matrix3);
                    myThreads[i] = new Thread(wt);
                    myThreads[i].start();
                }
                try {
                    myThreads[i].join();
                } catch (InterruptedException e) {
                }
            }
            System.out.println("The result of multiplying the matrices is: ");
            for (int i = 0; i < matrix3.length; i++) {
                for (int j = 0; j < matrix3[i].length; j++) {
                    System.out.print(matrix3[i][j] + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("The matrices you have entered are not multipliable");
        }
    }
}
