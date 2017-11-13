import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class SLF4JHello {


    private final Logger slf4jLogger = LoggerFactory.getLogger(SLF4JHello.class);


    public void sayHello(String name) {
        slf4jLogger.info("Hi, {}", name);
        slf4jLogger.info("Welcome to the HelloWorld example of SLF4J");
    }

    public static void main(String[] args) {
        SLF4JHello slf4jHello = new SLF4JHello();
        slf4jHello.sayHello("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");


    }
}