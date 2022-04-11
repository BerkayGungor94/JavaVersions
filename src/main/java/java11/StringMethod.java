package java11;

import org.junit.Test;

import java.util.stream.Collectors;

public class StringMethod {

    @Test
    public void Blank() {
        String s = " ";
        System.out.println(s.isBlank());

        String s1 = " ";
        System.out.println(s1.isEmpty());
    }

    @Test
    public void Strip() {
        String str = "               ____Berkay ";
        System.out.println(str.strip()); //baştaki boşluk karakterlerini siler
        System.out.println(str.repeat(3));
    }
}
