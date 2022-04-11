package java8.zOptionalClass;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {

    @Test
    public void empty() {
        System.out.println("Optional Empty instance");
        Optional<String> empty = Optional.empty();
        System.out.println("İçeride herhangi bir şey varmı? : " + empty.isPresent());
        Assert.assertFalse(empty.isPresent());
    }

    @Test
    public void of() { //Null değer kesinlikle alamaz.
        Optional<String> opt = Optional.of("Kron");
        System.out.println("İçeride herhangi bir şey var mı? : " + opt.isPresent());
    }
    @Test
    public void OfNullableNullValue() {   //Null değer alabilir.
        Optional<String> opt = Optional.ofNullable("Kron");
        System.out.println("İçerisi dolu mu? : " + opt.isPresent());

    }
}
