package java9;

import java8.functional.FunctionalInterfaces;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/** Factory methods sayesinde tek tek list.add(....) komutunu kullanmadan tek satırda listemize gerekli eklemeleri yapabiliyoruz.
 */

public class FactoryMethod {
    private static final Logger log = LoggerFactory.getLogger(FunctionalInterfaces.class);
    @Test
    public void Factory() {
        List<String> list = List.of("Berkay", "Güngör", "Kron");
        for (String l:list) {
            log.info("List : " + l);
        }
    }
}
