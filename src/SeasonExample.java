import java.util.Scanner;

public class SeasonExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name or number of the month: ");
        String input = scanner.nextLine().trim();

        String season;

        if (isNumeric(input)) {
            int monthNumber = Integer.parseInt(input);
            season = getSeasonByNumber(monthNumber);
        } else {
            String month = input.toLowerCase();
            season = getSeasonByName(month);
        }

        System.out.println("The season is: " + season);
        scanner.close(); // Close the scanner to prevent resource leaks
    }

    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    private static String getSeasonByNumber(int monthNumber) {
        return switch (monthNumber) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid month number. Please enter a number between 1 and 12.";
        };
    }

    private static String getSeasonByName(String month) {
        return switch (month) {
            case "december", "january", "february" -> "Winter";
            case "march", "april", "may" -> "Spring";
            case "june", "july", "august" -> "Summer";
            case "september", "october", "november" -> "Autumn";
            default -> "Invalid month name. Please enter a valid month name.";
        };
    }
}
