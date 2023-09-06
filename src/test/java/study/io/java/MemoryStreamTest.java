package study.io.java;

import org.junit.jupiter.api.Test;

import java.io.StringWriter;

public class MemoryStreamTest {
    @Test
    void testString() {
        StringWriter writer = new StringWriter();

        for (int i = 0; i < 10; i++){
            writer.write("Hello World\n");
        }

        String value = writer.getBuffer().toString();
        System.out.println(value);
    }
}
