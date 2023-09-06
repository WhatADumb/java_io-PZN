package study.io.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadTest {
    @Test
    void testReadFile() {
        Path path = Path.of("hello-world.txt");

        try(Reader reader = Files.newBufferedReader(path)){
            StringBuilder builder = new StringBuilder();
            int data;
            int counter = 0;

            while ((data = reader.read()) != -1){
                builder.append((char) data);
                counter++;
            }

            System.out.println(builder.toString());
            System.out.println(counter);
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }

    @Test
    void testReadFileBuffer() {
        Path path = Path.of("hello-world.txt");

        try(Reader reader = Files.newBufferedReader(path)){
            StringBuilder builder = new StringBuilder();
            char[] buffer = new char[1024];
            int length;
            int counter = 0;

            while ((length = reader.read(buffer)) != -1){
                builder.append(new String(buffer, 0, length));
                counter++;
            }

            System.out.println(builder.toString());
            System.out.println(counter);
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
