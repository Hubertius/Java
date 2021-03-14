import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
  
        String[] namesAndAges = new String[2];
        String[] names = new String[10];
        int[] ages = new int[10];
        int index = 0;
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            namesAndAges = input.split(",");
            names[index] = namesAndAges[0];
            ages[index] = Integer.parseInt(namesAndAges[1]);
            index++;
        }
        
        int longestName = 0;
        String nameOfLongest = "";
        for(int i = 0; i < index; i++) {
            if(longestName < names[i].length()) {
                longestName = names[i].length();
                nameOfLongest = names[i];
            }
        }
        System.out.println("Longest name: " + nameOfLongest);
        
        int average = 0;
        for(int i = 0; i < index; i++) {
            average += ages[i];
        }
        System.out.println("Average of the birth years: " + average / (double)index);
        System.out.println("Hello, World!");
        scanner.close();
    }
}
