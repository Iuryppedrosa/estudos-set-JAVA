package problema5.Application;

import problema5.Entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String path = "/Users/iurypedrosa/Desktop/Mesa/Sistemas de Informação./CURSOS/Back End/Java-Nelio-Udemy/Arquivos-curso/log.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();

            while (line!= null) {
                String[] entries = line.split(" ");
                String username = entries[0];
                Date moment = Date.from(Instant.parse(entries[1]));

                set.add(new LogEntry(username, moment));

                line = br.readLine();

            }

            System.out.println("Total user: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
