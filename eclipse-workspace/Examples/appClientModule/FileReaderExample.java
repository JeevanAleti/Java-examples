import java.io.FileReader;  
public class FileReaderExample {  
    public static void main(String args[])throws Exception{    
    	
    		// this is used to read the data from the file
          FileReader fr=new FileReader("C:\\Users\\jeeva\\Desktop\\textin1.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}   