package study.io.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ObjectStreamTest {
    @Test
    void testOutputStream() {
        Person fadhil = new Person();
        fadhil.setId(1);
        fadhil.setName("Fadhil Firmansyah");

        Path path = Path.of("fadhil.person");

        try(OutputStream stream = Files.newOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(stream)){
            outputStream.writeObject(fadhil);
            outputStream.flush();
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }

    @Test
    void testInputStream() {
        Path path = Path.of("fadhil.person");

        try(InputStream stream = Files.newInputStream(path);
            ObjectInputStream inputStream = new ObjectInputStream(stream)){

            Person fadhil = (Person) inputStream.readObject();

            Assertions.assertEquals(1, fadhil.getId());
            Assertions.assertEquals("Fadhil Firmansyah", fadhil.getName());
        } catch (IOException | ClassNotFoundException e) {
            Assertions.fail(e);
        }
    }
}
