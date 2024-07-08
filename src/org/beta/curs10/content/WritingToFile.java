package org.beta.curs10.content;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.lineSeparator;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt", false));
        writer.write("This is my first line" + lineSeparator());
        writer.write("This is my second line" + lineSeparator());
        writer.write("This is my third line" + lineSeparator());

        for (int i = 0; i < 10; i++) {
            writer.write(i + lineSeparator());
        }

        writer.close();
    }
}
