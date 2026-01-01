# Observer Pattern - Java Implementation

This project demonstrates the **Observer Design Pattern** using Java. The Observer Pattern is a behavioral design pattern where an object (the Subject) maintains a list of dependents (Observers) and notifies them automatically of any state changes.

## Project Structure

```
lld/
  observerPattern/
    com/
      example/
        observer/
          Demo.java
          EmailSubscriber.java
          NewsPublisher.java
          Observer.java
          SmsSubscriber.java
          Subject.java
```

## Components

- [`Observer`](lld/observerPattern/com/example/observer/Observer.java):  
  Interface for all observers. Defines the `update()` method.

- [`Subject`](lld/observerPattern/com/example/observer/Subject.java):  
  Interface for the subject (publisher). Methods to register, remove, and notify observers, and to get the latest news.

- [`NewsPublisher`](lld/observerPattern/com/example/observer/NewsPublisher.java):  
  Concrete implementation of `Subject`. Maintains a list of observers and notifies them when news is published.

- [`EmailSubscriber`](lld/observerPattern/com/example/observer/EmailSubscriber.java):  
  Concrete implementation of `Observer`. Receives updates via "email".

- [`SmsSubscriber`](lld/observerPattern/com/example/observer/SmsSubscriber.java):  
  Concrete implementation of `Observer`. Receives updates via "SMS".

- [`Demo`](lld/observerPattern/com/example/observer/Demo.java):  
  Main class to demonstrate the Observer Pattern in action.

## How It Works

1. Create a `NewsPublisher` (the Subject).
2. Create observers (`EmailSubscriber`, `SmsSubscriber`) and register them with the publisher.
3. When the publisher publishes news, all registered observers are notified and pull the latest news.

## Example Output

```
Alice(email) pulled: Breaking : Observer Pull Model Implemented!
Bob (SMS) pulled Breaking : Observer Pull Model Implemented!
Alice(email) pulled: Only Alice will see this!
```

## How to Run

1. Navigate to the `lld/observerPattern/com/example/observer/` directory.
2. Compile all Java files:
   ```sh
   javac *.java
   ```
3. Run the demo:
   ```sh
   java Demo
   ```
