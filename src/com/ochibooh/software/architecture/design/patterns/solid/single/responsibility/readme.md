# Solid Principles

## Single responsibility principle

**N/B:-** A method or class should only have one reason to change. ie each method should only perform a single task.

Have a method for printing a book and another for saving a book

```java
public class Book {
    public void print() {
        System.out.println("Printing a book...");
    }
    
    public void save(){
        System.out.println("Saving a book...");
    }
}
```

Instead use an `Interface` to implement various properties of the class.

```java
public interface BookImp {
    void print();
    void save();
}
```

On the other hand, we should favour `Composition` over `Inheritance`. Create a new class that performs a task and call the task on the override method to do the task 

```java
public class Book implements BookImp {

    private int numOfPages;
    private String authorName;
    
    private BookPersistence bookPersistence;

    public Book(int numOfPages, String authorName) {
             this.numOfPages = numOfPages;
             this.authorName = authorName;
             this.bookPersistence = new BookPersistence(); /* bookPersistence to new instance */
    }

    @Override
    public void print() {
        System.out.println("Printing a book...");
    }
    
    @Override
    public void save() {
        this.bookPersistence.save(this); /* calling save method */
    }
}
```