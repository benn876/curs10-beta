package org.beta.curs10.content;

import java.io.*;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        readingWithScanner();
        readingWithBufferedReader();
    }

    private static void readingWithBufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/content.txt"));
        String line;
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }

    private static void readingWithScanner() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files","content.txt"));
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
