public class Librarian extends Colleague {

    public Librarian(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Librarian received request for book: " + message);
        boolean isAvailable = Book.checkAvailability(message);
        if (isAvailable) {
            System.out.println("Librarian: Book is available.");
            mediator.send("Book '" + message + "' has been issued.", this);
        } else {
            System.out.println("Librarian: Book is NOT available.");
            mediator.send("Sorry, book '" + message + "' is not available.", this);
        }
    }
}
