package study.io.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathTest {
    @Test
    void testPath() {
        Path path = Path.of("pom.xml");

        Assertions.assertEquals("pom.xml", path.toString());
        Assertions.assertFalse(path.isAbsolute());
    }

    @Test
    void testPathFiles() {
        Path path = Path.of("pom.xml");

        Assertions.assertEquals("pom.xml", path.toString());
        Assertions.assertFalse(path.isAbsolute());
        Assertions.assertTrue(Files.exists(path));
    }
}
