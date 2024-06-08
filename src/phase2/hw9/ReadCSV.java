package phase2.hw9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCSV {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("C:\\java\\Employees.csv");
             InputStreamReader isr = new InputStreamReader(fis, "MS950");
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            int sum = 0;
            int counter = 0;
            String[] field;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                field = line.split(",");
                if (counter != 0) {
                    sum += Integer.parseInt
                            (
                            field[2].replaceAll("[\"\\s]", "")
                            + field[3].replaceAll("[\"\\s]", "")
                            );
                }
                counter++;
            }
            System.out.println("薪水加總: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
