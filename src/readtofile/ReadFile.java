package readtofile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		
		//write to file
		 try {
	            FileWriter myWriter = new FileWriter("filename2.txt");
	            myWriter.write("Writing to file\n");
	            myWriter.close();
	            System.out.println("Successfully wrote to the file.");
	          } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	          }
		 
		 
		 //append to file
		   try {
	            FileWriter myWriter = new FileWriter("filename2.txt", true);
	            myWriter.write("Appending to file");
	            myWriter.close();
	            System.out.println("Appending to file");
	          } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	          }
		 
		   
		 //read file
		 int ch; 
		 
		 System.out.println("\nTHE FILE SAYS: ");
		  
	        // check if File exists or not 
	        FileReader fr=null; 
	        try
	        { 
	            fr = new FileReader("filename2.txt"); 
	            while ((ch=fr.read())!=-1) 
		            System.out.print((char)ch); 
		  
		        // close the file 
		        fr.close(); 
	        } 
	        catch (FileNotFoundException fe) 
	        { 
	            System.out.println("File filename2.txt not found"); 
	        } 
	  
	        // read from FileReader till the end of file 
	}
}
