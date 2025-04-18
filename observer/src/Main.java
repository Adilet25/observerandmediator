public class Main {
    public static void main(String[] args) {
        ConcreteSubject newsFeed = new ConcreteSubject();
        ConcreteObserver subscriber1 = new ConcreteObserver("Alan");
        ConcreteObserver subscriber3 = new ConcreteObserver("Subscriber 3");
        newsFeed.addObserver(subscriber1);
        newsFeed.addObserver(subscriber3);
        newsFeed.setNews("Breaking News: Loro is hungry!");
        newsFeed.setNews("Latest Update: he ate humburger");
    }
}

