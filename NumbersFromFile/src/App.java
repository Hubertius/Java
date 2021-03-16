import java.util.Scanner;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner scannerOfFile = new Scanner(Paths.get(file))) {
            int count = 0;
            while(scannerOfFile.hasNextLine()) {
                String lineFromFile = scannerOfFile.nextLine();
                int convToNumber = Integer.valueOf(lineFromFile);
                if(convToNumber >= lowerBound && convToNumber <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch(Exception e) {
            scanner.close();
        }
        scanner.close();
         

    }

}
