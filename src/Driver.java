public class Driver{
    public static void main(String[]args) {
        if (args.length > 0) {
            if(Integer.parseInt(args[0])<0)
                System.err.println(args[0]+" must be >=0.");
            else {
                UserInput input = new UserInput();
                int [][] matrix1= input.fillMatrix();
                int [][] matrix2= input.fillMatrix();
                int [][] matrix3= new int[matrix1[0].length][matrix2.length];
                WorkerThread [][] Threads
                final int NUM_THREADS = (matrix1[0].length*matrix2.length);
                Thread[] workers = new Thread[NUM_THREADS];
                for(int i =0; i<=NUM_THREADS; i++){
                    workers[i] =  MatrixMultiplication(1,2,matrix1,matrix2,matrix3);
                }
                for(int i = 0; i<NUM_THREADS; i++)
                try {
                    workers[i].join();
                } catch (InterruptedException e) {}
            }
        }

    }


}
