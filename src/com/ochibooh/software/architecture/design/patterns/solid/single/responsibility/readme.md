# Solid Principles

## Single responsibility principle

**N/B:-** A method or class should only have one reason to change. ie each method should only perform a single task.

`public void print() {
    System.out.println("Printing a book...");
}
public void save(){
    System.out.println("Saving a book...");
}`

Instead use an `Interface` to implement various properties of the class.