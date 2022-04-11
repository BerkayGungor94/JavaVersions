package java13;

import org.junit.Test;

import java.time.LocalDate;

public class SwitchUpdate {

    @Test
    public void Update() {
        String hangiCeyrek = switch (LocalDate.now().getMonth()) {
            case JANUARY, FEBRUARY, MARCH:
                yield "İlk çeyrek";
            case APRIL, MAY, JUNE:
                yield "ikinci çeyrek";
            case JULY, AUGUST, SEPTEMBER:
                yield "üçüncü çeyrek";
            case OCTOBER, NOVEMBER, DECEMBER:
                yield "son çeyrek";
            default:
                yield "bilinmeyen çeyrek";
        };
        System.out.println(hangiCeyrek);
    }
}
