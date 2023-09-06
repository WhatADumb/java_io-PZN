package study.io.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerTest {
    @Test
    void testScanner() {
        Path path = Path.of("pom.xml");

        try(InputStream stream = Files.newInputStream(path);
            Scanner scanner = new Scanner(stream)){
            int counter = 0;

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
                counter++;
            }

            System.out.println(counter);

        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
