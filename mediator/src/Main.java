public class Main {
    public static void main(String[] args) {
        LibraryMediator mediator = new LibraryMediator();

        User user = new User(mediator, "Alice");
        Librarian librarian = new Librarian(mediator);

        mediator.registerUser(user);
        mediator.registerLibrarian(librarian);

        user.requestBook("Design Patterns");
        System.out.println();
        user.requestBook("Harry Potter"); // Not available
    }
}
