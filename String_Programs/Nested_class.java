
/* 
class OuterClass {
    public class PublicNestedClass {
        public void display()
        { //! A public nested class is accessible from any other class.
            System.out.println("This is a public nested class.");
        }
    }
}

public class Nested_class{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.PublicNestedClass nested = outer.new PublicNestedClass();
        nested.display();  // Accessible
    }
}

/////////////////////////////////////

class OuterClass 
{
    private class PrivateNestedClass 
    {
        public void display() 
        {
            System.out.println("This is a private nested class.");
        }
    }
    //!A private nested class is accessible only within the outer class.
    public void accessNested() 
    {
        PrivateNestedClass nested = new PrivateNestedClass();
        nested.display();  // Accessible within OuterClass
    }
}

public class Nested_class {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        // OuterClass.PrivateNestedClass nested = outer.new PrivateNestedClass(); // Error: not accessible
        outer.accessNested();  // Works fine
    }
}

////////////////////////////////////////////////////

//!A protected nested class is accessible within the same package and subclasses.

class OuterClass {
    protected class ProtectedNestedClass {
        public void display() {
            System.out.println("This is a protected nested class.");
        }
    }
}

class SubClass extends OuterClass {
    public void accessNested() {
        ProtectedNestedClass nested = new ProtectedNestedClass();
        nested.display();  // Accessible in subclass
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        // OuterClass.ProtectedNestedClass nested = outer.new ProtectedNestedClass(); // Error: not accessible outside package
    }
}


///////////////////////////////////////////////////////

//! A default (no access modifier) nested class is accessible only within the same package.

class OuterClass {
    class DefaultNestedClass {
        public void display() {
            System.out.println("This is a default (package-private) nested class.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.DefaultNestedClass nested = outer.new DefaultNestedClass();
        nested.display();  // Accessible within the same package
    }
}

// In another package, this class won't be accessible


Key Takeaways:
public nested class: Can be accessed from anywhere.
private nested class: Can only be accessed within the outer class.
protected nested class: Can be accessed in the same package or by a subclass.
default nested class: Can be accessed only within the same package.
These examples should give you a clear understanding of how access specifiers work with nested classes in Java.
*/
