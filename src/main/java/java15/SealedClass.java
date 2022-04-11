package java15;

public sealed class SealedClass permits Circle, Square, Rectangle {}

final class Circle extends SealedClass {
    float radius;
}
non-sealed class Square extends SealedClass {
    float side;
}
sealed class Rectangle extends SealedClass permits FilledRectangle {
    float length, width;
}


