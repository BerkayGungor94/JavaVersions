package java8.streamApiLambdaMethodRef;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ali", "ahmet", "ayşe", "berkay");

        list.stream().filter(s -> s.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);
    }
}
