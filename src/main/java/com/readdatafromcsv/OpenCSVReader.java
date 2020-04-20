package com.readdatafromcsv;
import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class OpenCSVReader
{
    public static void main(String args[]) throws IOException
    {
        /* Setting The Path */
        String path = "user.csv";
        Reader reader = Files.newBufferedReader(Paths.get(path));
        CSVReader csvReader = new CSVReader(reader);
        //Reading all records one by one
        String[] nextRecords;
        while ((nextRecords = csvReader.readNext()) != null) {
            System.out.println("Name:" + nextRecords[0]);
            System.out.println("Email:" + nextRecords[1]);
            System.out.println("Phone no:" + nextRecords[2]);
            System.out.println("Country:" + nextRecords[3]);
            System.out.println("=======================");
        }
        //Reading all records at once
        List<String[]> records = csvReader.readAll();
        for (String[] record : records) {
            System.out.println("Name:" + record[0]);
            System.out.println("Email:" + record[1]);
            System.out.println("Phone No:" + record[2]);
            System.out.println("Country:" + record[3]);
            System.out.println("========================");
        }
    }
}

