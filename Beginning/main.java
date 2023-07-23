package Beginning;
public class main {
    public static void main(String[] args){    // it can also be written as String args[] or String []args 
        System.out.println("Hello World");
    }
}

// class is a keyword to declare a class in Java

// public keyword is an access modifier that represents visibility. It means it is visible to all.

// static is a keyword. If we declare any method as static, it is known as the static method. The core advantage of the static method is that there is no need to create an object to invoke the static method. The main() method is executed by the JVM, so it doesn't require creating an object to invoke the main() method. So, it saves memory.

// void is the return type of the method. It means it doesn't return any value.

// String[] args or String args[] is used for command line argument. We will discuss it in coming section.

// System.out.println() is used to print statement. Here, System is a class, out is an object of the PrintStream class, println() is a method of the PrintStream class. We will discuss the internal working of System.out.println() statement in the coming section.
