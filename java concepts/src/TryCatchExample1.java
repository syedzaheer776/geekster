
public class TryCatchExample1 {
	  public static void main(String[] args) {  
	        try  
	        {  
	        int data=50/0;    
	  
	        }  
	              
	        catch(ArrayIndexOutOfBoundsException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	    }  
	      
	}  


