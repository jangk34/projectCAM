/*package poly.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac {

	public static void main(String[] args) {
		
			    List<List<String>> ret = new ArrayList<>();
				BufferedReader br = null;
				
				try {
					br = Files.newBufferedReader((Path) new InputStreamReader(new FileInputStream(Paths.get("C:\\pro\\CampingProject\\WebContent\\resource\\csv\\grate.csv")),"utf-8"));
					//Paths.get("C:\\pro\\CampingProject\\WebContent\\resource\\csv\\grate.csv"),Charset.forName("UTF-8")
					String line = "";
					
					while((line = br.readLine()) != null) {
						List<String> tmpList = new ArrayList<String>();
						String array[] = line.split(",");
						tmpList = Arrays.asList(array);
						System.out.println(tmpList);
						ret.add(tmpList);						
					}
					
				 }catch(FileNotFoundException e){
			            e.printStackTrace();
			        }catch(IOException e){
			            e.printStackTrace();
			        }finally{
			            try{
			                if(br != null){
			                    br.close();
			                }
			            }catch(IOException e){
			                e.printStackTrace();
			            }


			        }
	  }
	}
*/