package java8.methodReference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    public void Numbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        log.info("Dizi : " + numbers);
    }

    public static void main(String[] args) {
        Application application = new Application();
        TestMethod test1 = application::Numbers;
        test1.test();
    }
}