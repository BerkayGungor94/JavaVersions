package java9;

import java8.functional.FunctionalInterfaces;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class WithoutFactory {
    private static final Logger log = LoggerFactory.getLogger(FunctionalInterfaces.class);
    @Test
    public void withoutFactory() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaFX");
        list.add("Spring");
        list.add("Hibernate");
        list.add("JSP");
        for(String l : list){
            log.info(l);
        }
    }
}
