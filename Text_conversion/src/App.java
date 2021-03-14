import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("java Substring ");
        String textInput = scanner.nextLine();
        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        System.out.println("wyswietla:");
        if((firstIndex < 0 || firstIndex > secondIndex) || (secondIndex < 0)) {
            scanner.close();
            return;
        } else if((firstIndex >= textInput.length())) {
            scanner.close();
            return;            
        }
        for(int i = firstIndex; i <= secondIndex && i < textInput.length(); i++) {
            System.out.print(textInput.charAt(i));
        }
        scanner.close();
        return;
    }
}
