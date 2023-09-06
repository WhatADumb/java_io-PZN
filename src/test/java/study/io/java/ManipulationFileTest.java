package study.io.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ManipulationFileTest {
    @Test
    void testFiles() throws IOException {
        Path path = Path.of("sample.txt");
        Files.createFile(path);
        Assertions.assertTrue(Files.exists(path));

        Files.delete(path);
        Assertions.assertFalse(Files.deleteIfExists(path));
    }

    @Test
    void testDirectories() throws IOException {
        Path path = Path.of("datas");
        Files.createDirectory(path);
        Assertions.assertTrue(Files.exists(path));
        Assertions.assertTrue(Files.isDirectory(path));

        Files.delete(path);
        Assertions.assertFalse(Files.exists(path));
    }
}
