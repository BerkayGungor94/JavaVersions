package java10;

import org.junit.Test;
import java.util.Arrays;

public class CopyOfExample {
    @Test
    public void Example() {

        int[] dizi = new int[] {1, 2 ,3};
        System.out.println("Original Array");
        for (int i = 0; i < dizi.length; i++)
            System.out.print(dizi[i] + " ");


        int[] copy = Arrays.copyOf(dizi, 5);
        copy[3] = 11;
        copy[4] = 55;

        System.out.println("\nNew array copy after modifications:");
        for (int i = 0; i < copy.length; i++)
            System.out.print(copy[i] + " ");
        }
    }
