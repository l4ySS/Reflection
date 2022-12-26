package org.example;
import java.io.IOException;


public class Main {
    public static void main(String... args) throws IOException, InstantiationException, IllegalAccessException {
        Bean bean = (new Injector<Bean>("src/main/java/org/example/properties/injector.properties").inject(new Bean()));
        bean.go();
    }
}