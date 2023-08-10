/* 
  Write a Java program that implements a multithreaded application that has three threads. 
  First thread generates a random integer for every 1 second; 
  second thread computes the square of the number and prints; 
  third thread will print the value the cube of the number.
*/

package Multithread_Application;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Square implements Runnable {
    private int num;

    Square(int n) {
        num = n;
    }

    public void printSquare() {
        System.out.println("Square of " + num + " is " + (num * num));
    }

    public void run() {
        printSquare();
    }
}

class Cube implements Runnable {
    private int num;

    Cube(int n) {
        num = n;
    }

    public void printCube() {
        System.out.println("Cube of " + num + " is " + (num * num * num));
    }

    public void run() {
        printCube();
    }
}

class RandInt extends Thread {
    private final ExecutorService executor = Executors.newFixedThreadPool(2);

    public void printRandom() throws InterruptedException {
        Random rd = new Random();
        while (true) {
            int rnum = rd.nextInt(10);
            System.out.println("Random Number is " + rnum);
            Thread.sleep(3000);
            executor.submit(new Square(rnum));
            executor.submit(new Cube(rnum));
        }
    }

    public void run() {
        try {
            printRandom();
        } catch (InterruptedException e) {
        }
    }

    public void shutdown() {
        executor.shutdown();
    }

    public void awaitTermination() throws InterruptedException {
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}

public class multithread {
    public static void main(String[] args) {
        RandInt ob1 = new RandInt();
        ob1.start();

        try {
            Thread.sleep(15000); // Run for 15 seconds
            ob1.shutdown();
            ob1.awaitTermination();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

