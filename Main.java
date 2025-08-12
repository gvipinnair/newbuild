import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    // Method to print your success message
    public static void printSuccessMessage() {
        System.out.println("Hi karan, fuck off.");
    }

    // Method to print current time
    public static void printCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedTime = now.format(formatter);
        System.out.println("Job executed at: " + formattedTime);
    }

    public static void main(String[] args) {
        System.out.println("------ Jenkins Java Job ------");
        printSuccessMessage();
        printCurrentTime();
        System.out.println("------ Execution Completed ------");
    }
}
