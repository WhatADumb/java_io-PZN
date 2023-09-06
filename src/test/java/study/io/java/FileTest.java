package study.io.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class FileTest {
    @Test
    void testFile() {
        File file = new File("sample.txt");

        Assertions.assertEquals("sample.txt", file.getName());
        Assertions.assertFalse(file.exists());
    }

    @Test
    void testFileAbsolutPath() {
        File file = new File("src/main/resources/application.properties");

        Assertions.assertEquals("application.properties", file.getName());
        Assertions.assertTrue(file.exists());
    }
}
