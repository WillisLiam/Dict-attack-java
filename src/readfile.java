
import java.io.File;  // Import the File class
//import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files


public class readfile {

	public static void main (String[] args)  {
		
	
         
        	
			try {
				ArrayList<String> names = new ArrayList<String>();
				ArrayList<Integer> hashed = new ArrayList<Integer>();
				File myObj = new File("C:\\Users\\CJ\\Desktop\\JAVA TUT\\Dict attack\\src\\name.txt");
				Scanner myReader = new Scanner(myObj);
				
				int count =0;
			   for (int i =0; i<=myObj.length(); i++) {
					  if (myReader.hasNextLine()) {
					  String data = myReader.nextLine();
					 hashed.add(data.hashCode() );
					  names.add(data);
					  count++;
					  if (data.hashCode() == 1590127915){
						System.out.println(count + " " + names.get(i));
					}

					  
					  }
					 // System.out.print(hashed.get(i) + " ");
					 

					  
                   
					  
			   }
			   
			   
			  
				
				myReader.close();
			} catch (Exception e) {}
				
			}
		   
	}