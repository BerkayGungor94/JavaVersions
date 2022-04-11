package java12;

import org.junit.Test;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/** indent : String ifadeye belirtildiği kadar girinti verir veya girinti siler. Ayrıca ifadenin sonuna \n ekler.
 */

public class StringApiNew {

    @Test
    public void NewMWthods() {
        var myName = "            Berkay\n Güngör Kron";
        System.out.println(myName);
        System.out.println(myName.indent(10));
        System.out.println(myName.indent(-5));
    }

    @Test
    public void Transform() {
        var myNumber = "  100";
        System.out.println(myNumber);
        System.out.println(myNumber.getClass());

        var myInt = myNumber.strip().transform(Integer::parseInt);
        System.out.println(myInt);
        System.out.println(myInt.getClass());
    }
}


