package java12;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumber {

    @Test
    public void Number() {

        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

        System.out.println( fmt.format(100) );
        System.out.println( fmt.format(1000) );
        System.out.println( fmt.format(10000) );
        System.out.println( fmt.format(100000) );
        System.out.println("*******************-------------*****************");

        NumberFormat fmtShort = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);

        System.out.println( fmtShort.format(100) );
        System.out.println( fmtShort.format(1000) );
        System.out.println( fmtShort.format(10000) );
        System.out.println( fmtShort.format(100000) );
        System.out.println("*******************-------------*****************");
    }
}
