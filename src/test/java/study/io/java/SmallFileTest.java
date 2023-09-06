package study.io.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SmallFileTest {
    @Test
    void testWrite() throws IOException {
        Path path1 = Path.of("sample-mini1.txt");

        byte[] bytes = "Sample here".getBytes();
        Files.write(path1, bytes);
        Assertions.assertTrue(Files.exists(path1));

        Path path2 = Path.of("sample-mini2.txt");

        Files.writeString(path2, "Sample here");
        Assertions.assertTrue(Files.exists(path2));
    }

    @Test
    void testRead() throws IOException {
        Path path1 = Path.of("sample-mini1.txt");

        byte[] bytes = Files.readAllBytes(path1);
        String value1 = new String(bytes);
        Assertions.assertEquals("Sample here", value1);

        Path path2 = Path.of("sample-mini2.txt");

        String value2 = Files.readString(path2);
        Assertions.assertEquals("Sample here", value2);
    }
}
