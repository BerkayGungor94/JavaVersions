package java8.functional;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunctionalInterfaces  {
    private static final Logger log = LoggerFactory.getLogger(FunctionalInterfaces.class);

    @Test
    public void Operation() {
        Math sum = (a, b) -> log.info("Sum : " + (a + b));
        sum.operation(5,5);

        Math minus = (a, b) -> log.info("Minus : " + (a - b));
        minus.operation(5,5);

        Math multiply= (a, b) -> log.info("Multiply : " + (a * b));
        multiply.operation(5,5);
    }
}



