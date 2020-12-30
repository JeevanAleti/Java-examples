import java.io.*;  
public class BufferedWriterExample {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("C:\\Users\\jeeva\\Desktop\\testout.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    //same as file writer but it uses buffer to increase the performance
   
    buffer.write("Welcome to javaTpoint by Jeevan.");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  