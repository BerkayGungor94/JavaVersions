package java14;

public class RecordExample {
    public static void main(String[] args) {
        Person berkay = new Person("Berkay", "GÜNGÖR", 27);
        System.out.println(berkay);
        System.out.println(berkay.firstName());
        System.out.println(berkay.lastName());
        System.out.println(berkay.age());
    }

    record Person(String firstName, String lastName, Integer age) {}

}
