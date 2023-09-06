package study.io.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class OutputStreamTest {
    @Test
    void testWrite() {
        Path path = Path.of("hello-world.txt");

        try(OutputStream stream = Files.newOutputStream(path)){
            for (int i = 0; i < 100; i++){
                stream.write("Hello World, everyone \n".getBytes());
                stream.flush();
            }
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
