package study.io.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteTest {
    @Test
    void testWrite() {
        Path path = Path.of("sample-write.txt");

        try(Writer writer = Files.newBufferedWriter(path)){
            for(int i = 0; i < 100; i++){
                writer.write("Sample word \n");
                writer.flush();
            }
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
