package com.mohanraj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvParser {

    public static void main(String[] args) throws IOException {

        String path =  "****\\data.csv"; // Absolute path set;
        String line = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while((line = bufferedReader.readLine()) != null){
            String[] values = line.split(",");
            for(String value: values){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }


}
