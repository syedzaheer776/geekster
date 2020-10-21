import java.beans.Statement;
import java.io.*;  
public class Serialization {
	 public static void main(String args[]){  
		  try{  
		   
		  Statement s1 =new Statement(211,"ravi");  
		 
		  FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(s1);  
		  out.flush();  
		   
		  out.close();  
		  System.out.println("success");  
		  }catch(Exception e){System.out.println(e);}  
		 }  

}
