
public class App {
    public static void main(String[] args)  {

        // check for three command line arguments
        int lengthOfArgs = args.length;
        if(lengthOfArgs != 3) {
            System.out.println("Number of args is wrong!");
            return;
        }

        // check if these three command line arguments are integers
        double[] doubleArrayForArgs = new double[3];
        for(int i = 0; i < 3; i++) {
            try {
                doubleArrayForArgs[i] = Double.parseDouble(args[i]);
            } catch(NumberFormatException e) {
                System.out.println(e);
            }
        }

        double delta = Math.pow(doubleArrayForArgs[1], 2.0) - 4 * doubleArrayForArgs[0] * doubleArrayForArgs[2];    // Δ calculation
        if(delta < 0) { // Δ < 0
            System.out.println("Zero solutions.");
        } else if(delta == 0) { // Δ == 0
            double x = -1 * doubleArrayForArgs[1] / 2 * doubleArrayForArgs[0] ;
            System.out.println("One solution (double root). It's value = " + x);
        } else { // Δ > 0
            double x1 = (-1 * doubleArrayForArgs[1] - Math.sqrt(delta)) / 2 * doubleArrayForArgs[0];
            double x2 = (-1 * doubleArrayForArgs[1] + Math.sqrt(delta)) / 2 * doubleArrayForArgs[0];
            System.out.println("Two solutions (x1 and x2). x1 = " + x1 + " x2 = " + x2);
        }
        System.out.println("THE END OD THE PROGRAM!");
    }
}
