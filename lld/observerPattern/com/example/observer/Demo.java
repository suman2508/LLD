public class Demo {
    public static void main(String[] args)
    {
        NewsPublisher publisher = new NewsPublisher();

        Observer alice = new EmailSubscriber("Alice", publisher);
        Observer bob = new SmsSubscriber("Bob", publisher);

        publisher.registerObserver(alice);
        publisher.registerObserver(bob);

        publisher.publishNews("Breaking : Observer Pull Model Implemented!");
        publisher.removeObserver(bob);
        publisher.publishNews("Only Alice will see this!");
    }
}
