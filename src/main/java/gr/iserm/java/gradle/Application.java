package gr.iserm.java.gradle;

public class Application {
    public void run() {
        System.out.println("hello!");
        ApplicationData.builder().name("test").build();
    }
}
