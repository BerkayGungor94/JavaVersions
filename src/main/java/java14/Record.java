package java14;

public interface Record {
    record Person(String firstName, String lastName, Integer age) {}
}
