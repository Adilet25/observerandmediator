public class LibraryMediator implements Mediator {
    private User user;
    private Librarian librarian;

    public void registerUser(User user) {
        this.user = user;
    }

    public void registerLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    @Override
    public void send(String message, Colleague sender) {
        if (sender instanceof User) {
            librarian.receive(message); // user requests -> librarian handles
        } else if (sender instanceof Librarian) {
            user.receive(message); // librarian responds -> user receives
        }
    }
}
