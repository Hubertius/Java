public class App {
    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) { // not used function in the program
        // part 2 of the exercise
        for(int i = 1; i <= size; i++) {
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for(int i = 1; i <= height; i++ ) {
            printSpaces(height-i);
            if(i == 1) {
                printStars(i);
            } else {
                printStars(i + (i - 1));
            }    
        }
        for(int j = 1; j <= 2; j++) {
            printSpaces(height-2);
            printStars(3);
        }
        
    }

    public static void main(String[] args) {
 
        System.out.println("---");
        christmasTree(10);

    }
}
