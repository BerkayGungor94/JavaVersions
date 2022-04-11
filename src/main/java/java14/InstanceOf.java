package java14;

import org.junit.Test;

public class InstanceOf {

    @Test
    public void Instance() {
         Object obj = 1;
         if(obj instanceof  String s) {
             System.out.println(s);
         } else {
             System.out.println(obj.getClass());
             System.out.println("not a string");
         }
    }

}