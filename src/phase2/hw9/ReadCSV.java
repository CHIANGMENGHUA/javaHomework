package phase2.hw9;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ReadCSV {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\java\\Employee.csv", Charset.forName("MS950")));
             CSVParser cp = new CSVParser(br, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {

            int totalSalary = 0;

            for (CSVRecord cr : cp) {
                String name = cr.get("姓名");
                String salary = cr.get("薪水").replaceAll("[\"\\s,]", "");

                System.out.println("姓名: " + name + ", 薪水: " + Integer.parseInt(salary));
                totalSalary += Integer.parseInt(salary);
            }

            System.out.println("薪水加總: " + totalSalary);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}