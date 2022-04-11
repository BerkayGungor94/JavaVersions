package java13;

import org.junit.Test;

public class TextBlocks {

    @Test
    public void TextBlocksApp() {
        String multiLine = """
                I am Berkay
                Welcome
                to Course
                """;
        System.out.println(multiLine);
    }
}
