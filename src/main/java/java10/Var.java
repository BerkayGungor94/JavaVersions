package java10;

import com.sun.security.jgss.GSSUtil;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/** var anahtar sözcüğü kullanılırken mutlaka ilk değer verilmiş olmalıdır. Aksi halde error oluşur. Derleyici,
 * bu noktada var'ın hangi tipte kullanılcağını bilmediği için hata mesajı verecektir.
 */

public class Var {

    @Test
    public void whenVarInitWithString_thenGetStringTypeVar() {
        var message = "Hello, Java 10";
            System.out.println(message);
            System.out.println(message.getClass());
        }
    }




