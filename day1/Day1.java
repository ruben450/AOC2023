package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day1 {

    List<String> lines = new ArrayList<>();
    public Day1() {
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(System.getProperty("user.dir") + "\\day1\\data.txt"));
            String line;

            while((line = reader.readLine()) != null) {
                lines.add(line);
            }

            reader.close();
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    public void part1(){
        int total = 0;
        for (String line : lines) {
            String numberOnly = line.replaceAll("[^0-9]", "");
            int a = 0;
            int b = 0;
            if (numberOnly.length() > 1){
                a = Integer.parseInt(numberOnly.substring(0, 1));
                b = Integer.parseInt(numberOnly.substring(numberOnly.length() - 1, numberOnly.length()));
            } else {
                a = b = Integer.parseInt(numberOnly);
            }
            System.out.println(a + "" + b);
            total += Integer.parseInt(a + "" + b);
        }
        System.out.println(total);
    }
}
