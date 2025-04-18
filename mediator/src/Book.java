import java.util.Arrays;
import java.util.List;

public class Book {
    private static final List<String> availableBooks = Arrays.asList("Clean Code", "Java Basics", "Design Patterns");

    public static boolean checkAvailability(String title) {
        return availableBooks.contains(title);
    }
}
