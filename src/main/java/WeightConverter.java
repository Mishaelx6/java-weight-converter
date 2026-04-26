import java.util.Scanner;

public class WeightConverter {
    private static final double POUNDS_TO_KILOGRAMS = 0.453592;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Weight Converter ===");
        System.out.println("Bidirectional weight conversion tool");
        System.out.println();
        
        while (true) {
            System.out.println("Select conversion direction:");
            System.out.println("1. Pounds (lbs) to Kilograms (kgs)");
            System.out.println("2. Kilograms (kgs) to Pounds (lbs)");
            System.out.println("3. Quit");
            System.out.print("Enter your choice (1-3): ");
            
            String choice = scanner.nextLine().trim();
            
            if (choice.equals("3") || choice.equalsIgnoreCase("quit") || choice.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            
            switch (choice) {
                case "1":
                    convertPoundsToKilograms(scanner);
                    break;
                case "2":
                    convertKilogramsToPounds(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    System.out.println();
                    break;
            }
        }
        
        scanner.close();
    }
    
    private static void convertPoundsToKilograms(Scanner scanner) {
        System.out.println();
        System.out.println("--- Pounds to Kilograms ---");
        
        while (true) {
            System.out.print("Enter weight in pounds (or 'back' to return to menu): ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("back")) {
                System.out.println();
                return;
            }
            
            try {
                double pounds = Double.parseDouble(input);
                if (pounds < 0) {
                    System.out.println("Please enter a positive weight value.");
                    continue;
                }
                
                double kilograms = poundsToKilograms(pounds);
                System.out.printf("%.2f lbs = %.2f kgs%n", pounds, kilograms);
                System.out.println();
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'back' to return to menu.");
                System.out.println();
            }
        }
    }
    
    private static void convertKilogramsToPounds(Scanner scanner) {
        System.out.println();
        System.out.println("--- Kilograms to Pounds ---");
        
        while (true) {
            System.out.print("Enter weight in kilograms (or 'back' to return to menu): ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("back")) {
                System.out.println();
                return;
            }
            
            try {
                double kilograms = Double.parseDouble(input);
                if (kilograms < 0) {
                    System.out.println("Please enter a positive weight value.");
                    continue;
                }
                
                double pounds = kilogramsToPounds(kilograms);
                System.out.printf("%.2f kgs = %.2f lbs%n", kilograms, pounds);
                System.out.println();
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'back' to return to menu.");
                System.out.println();
            }
        }
    }
    
    public static double poundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }
    
    public static double kilogramsToPounds(double kilograms) {
        return kilograms / POUNDS_TO_KILOGRAMS;
    }
}
