package study.io.java;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nama Anda: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
