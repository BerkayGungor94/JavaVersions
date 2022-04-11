package java11;

import org.junit.Test;

import java.util.stream.IntStream;

/** Java 10 ile gelen var ifadesinin kapsamı genişletirelerek, Java 11'de lambda expressionslar ile kullanma imkanı gelmiştir.
 Yerel değişken kullanımı sağlar. Aşağıda ki kodda bunun örneğini görmekteyiz.
 */

public class Lambda {

    @Test
    public void LambdaParameters() {
        IntStream.of(1, 2, 3, 4, 5, 6).filter((var i) -> i % 3 == 0).forEach(System.out::println);
    }
}
