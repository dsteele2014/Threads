public class Driver{
    public static void main(String[]args) {
        if (args.length > 0) {
            if(Integer.parseInt(args[0])<0)
                System.err.println(args[0]+" must be >=0.");
            else {
                UserInput total = new UserInput();
                int upper = Integer.parseInt(args[0]);
                Thread thrd = new Thread(new MatrixMultiplication());
                thrd.start();
                try {
                    thrd.join();
                    System.out.println("The resulting of multiplying the matrices ""is " +);
                } catch (InterruptedException e) {}
            }
        }
    }
}
