public class User extends Colleague {
    private String name;

    public User(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void requestBook(String bookName) {
        System.out.println(name + " requests the book: " + bookName);
        mediator.send(bookName, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}
