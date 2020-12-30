import java.io.*;    

class Input1{    

public static void main(String args[])throws Exception{    
   FileInputStream fin1=new FileInputStream("C:\\Users\\jeeva\\Desktop\\textin1.txt");    
   FileInputStream fin2=new FileInputStream("C:\\Users\\jeeva\\Desktop\\textin2.txt");    
   FileOutputStream fout=new FileOutputStream("C:\\Users\\jeeva\\Desktop\\textout.txt");      
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
   int i;    
   while((i=sis.read())!=-1)    
   {    
     fout.write(i);        
   }    
   sis.close();    
   fout.close();      
   fin1.close();      
   fin2.close();       
   System.out.println("Success..");  
  }    
}    