import java.io.FileWriter;  
public class FileWriterExample {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("C:\\Users\\jeeva\\Desktop\\testout.txt");    
           fw.write("Welcome Jeevan Reddy Aleti.");    
           // this is used to write the string data into file
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  