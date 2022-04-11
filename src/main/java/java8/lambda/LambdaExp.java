package java8.lambda;

public class LambdaExp {
    public static void main(String[] args) {
        double result = execute(5.0, 7.0, (a, b) -> (a + b));  //Lambdayı parametre olarak geçerek istediğimiz eşitliği yazabiliriz.
        System.out.println(result);
    }
    private static double execute(double first, double second, Calculate calculate) {
        return calculate.execute(first, second);
    }
}
