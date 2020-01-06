package main.com.rs.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println("Hello133... Hello");
      }

    private final String getMessage() {
        return message;
    }

}


