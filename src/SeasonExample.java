import java.util.Scanner;

public class SeasonExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the month: ");
        String month = scanner.nextLine().trim().toLowerCase();

        String season = switch (month) {
            case "december", "january", "february" -> "Winter";
            case "march", "april", "may" -> "Spring";
            case "june", "july", "august" -> "Summer";
            case "september", "october", "november" -> "Autumn";
            default -> "Invalid month. Please enter a valid month name.";
        };

        System.out.println("The season is: " + season);
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}