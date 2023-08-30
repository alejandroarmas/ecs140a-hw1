package src;

import java.io.*;
import java.nio.file.*;
import java.util.Vector;
import src.AbstractReader;


public class Reader implements AbstractReader {

    public Vector<String> read(String filename) throws Exception {
    
        Vector<String> student_str_records = new Vector<>();

        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);
        String st;
        
        while ((st = br.readLine()) != null)
            student_str_records.add(st);
        
        return student_str_records;
    }

}