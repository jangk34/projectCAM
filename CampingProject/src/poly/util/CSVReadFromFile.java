package poly.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVReadFromFile {
   
   private List<String[]> data = new ArrayList<String[]>();

   public CSVReadFromFile() {}

   public List<String []> readCSV(String filepath) throws Exception {

      try {
         //파일 형식이 csv일 때 사용
         CSVReader reader = new CSVReader(new FileReader(filepath));
         // UTF-8 
         //CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream("C:\\pro\\CampingProject\\WebContent\\" + filepath), "UTF-8"), ',', '"', 1);
         String[] s;
         while ((s = reader.readNext()) != null) {
            data.add(s);
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }

      return data;
   }
}