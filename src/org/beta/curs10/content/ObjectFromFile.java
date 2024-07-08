package org.beta.curs10.content;

import org.beta.curs10.content.collections.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.util.regex.Pattern.quote;

public class ObjectFromFile {
    public static void main(String[] args) throws IOException {
        List<Person> people = readPersonFromFile();
        System.out.println(people);
        writeReport(people);
    }

    private static void writeReport(List<Person> people) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/report.txt"));
        for (Person person : people) {
            if(person.getAge() > 35){
                writer.write(person.toString());
                writer.newLine();
            }
        }

        writer.close();
    }

    private static List<Person> readPersonFromFile() throws FileNotFoundException {
        List<Person> persons = new ArrayList<>();

        Scanner scanner = new Scanner(new File("files", "persons.txt"));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] splitLine = line.split(quote("|"));
            persons.add(new Person(splitLine[0], parseInt(splitLine[1])));
        }

        return persons;
    }
}
