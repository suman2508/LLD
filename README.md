# Low Level Design (LLD) Patterns Practice

This repository is a collection of Java implementations for various **Low Level Design (LLD) patterns**. It is intended as a learning resource and reference for software engineers and students who want to understand and practice classic design patterns through hands-on examples.

## Repository Structure

Each design pattern is organized in its own directory under `lld/`, with clear separation of code, documentation, and examples.

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
    docs/
      Observer Pattern - Java Implementation.md
  ... (other patterns coming soon)
```

## Included Patterns

- **Observer Pattern**  
  Behavioral pattern where an object (Subject) notifies its dependents (Observers) about state changes.  
  [See implementation and details](lld/observerPattern/com/example/observer/docs/Observer%20Pattern%20-%20Java%20Implementation.md)

*More patterns will be added over time, including Singleton, Strategy, Factory, Decorator, and more.*

## How to Use

1. **Navigate** to the pattern directory you want to explore (e.g., `lld/observerPattern/com/example/observer/`).
2. **Compile** the Java files:
   ```sh
   javac *.java
   ```
3. **Run** the demo class:
   ```sh
   java Demo
   ```