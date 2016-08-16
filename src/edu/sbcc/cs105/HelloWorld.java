package edu.sbcc.cs105;

/**
 * This class implements the classic hello world program. Upon invocation, it
 * simply prints the text "Hello World!".
 * 
 * @author Allan Knight
 */
public class HelloWorld {

    public static String helloWorld() {
        return "Hello, World!";
    }
    
    public static void main(String[] args) {
        System.out.println(helloWorld());
    }
}