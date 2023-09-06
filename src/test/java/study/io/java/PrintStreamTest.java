package study.io.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrintStreamTest {
    @Test
    void testPrintStreamConsole() {
        PrintStream stream = System.out;

        stream.println("Sample word");
        stream.println("Sample word");
        stream.println("Sample word");
    }

    @Test
    void testPrintStreamFile() {
        Path path = Path.of("init.txt");

        try(OutputStream stream = Files.newOutputStream(path);
        PrintStream printStream = new PrintStream(stream)){

            printStream.println("Hello World");

        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
