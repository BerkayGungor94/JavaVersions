package java9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class ABCD<T>{
        abstract T show(T a, T b);
    }

    public class Diamond {
        private static final Logger log = LoggerFactory.getLogger(Diamond.class);
        public static void main(String[] args) {
            ABCD<String> a = new ABCD<String>() { // diamond operator is not empty
                String show(String a, String b) {
                    return a + b;
                }
            };
            String result = a.show("Java","9");
            log.info("String : " + result);
        }
    }
