package java12;


public class SwitchExpressions {
    public static void main(String[] args) {
        System.out.println(Days("Sunday"));
    }

    public static String Days(String whichDay) {
            return switch (whichDay) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekdays";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Please insert a valid day!";
            };
    }
}

