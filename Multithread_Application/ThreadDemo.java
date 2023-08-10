/* 
  Write a Java program that implements a multithreaded application that has three threads. 
  First thread generates a random integer for every 1 second; 
  second thread computes the square of the number and prints; 
  third thread will print the value the cube of the number.
*/

package Multithread_Application;

import java.util.*;

class FirstThread extends Thread{
    public void run(){
        Random obj = new Random();
        while (true){
            int rand = obj.nextInt (20) ;
            System.out.println("Random Integer is :" + rand);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException ex){
                 System.out.println("Error during sleep..");
            }
            SecondThread secthread = new SecondThread (rand) ;
            secthread.start();

            ThirdThread thread = new ThirdThread(rand);
            thread.start();
        }
    }
}

class SecondThread extends Thread{
    private int num;
    public SecondThread(int n){
        num = n;
    }
    public void run(){
        int square = num * num;
        System.out.println("Square of the number:" + num +"is"+ square);
    }
}

class ThirdThread extends Thread{
    private int num;
    public ThirdThread (int n){
        num = n;
    }
    public void run(){
        int cube = num * num * num;
        System.out.println("cube of the number: " + num +" is " + cube);
    }
}

public class ThreadDemo{
    public static void main(String[] args){
        FirstThread fthread = new FirstThread();
        fthread.start();
    }
}