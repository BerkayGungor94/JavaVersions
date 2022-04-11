package java14;

import java8.functional.FunctionalInterfaces;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/** Record anahtar sözcüğüyle declare edilen Data sınıfları , otomatik olarak getter/setter, constructor, equals() gibi
 standart methodlara sahip olarak bazı kod parçalarından kurtulmayı sağlar.
 */

 public class RecordApp implements Record {
    private static final Logger log = LoggerFactory.getLogger(FunctionalInterfaces.class);
    @Test
    public void Execute() {
        Person p1 = new Person("Berkay", "Güngör", 27);

        log.info("İsim : " + p1.firstName());
        log.info("Soyisim : " + p1.lastName());
        log.info("Yaş : " + p1.age());
        log.info("**********************************************");

        Person p2 = new Person("Selçuk", "İnan", 36);

        log.info("İsim : " + p2.firstName());
        log.info("Soyisim : " + p2.lastName());
        log.info("Yaş : " + p2.age());



    }
}