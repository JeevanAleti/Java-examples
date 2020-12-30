public class CallByVal{
 int data=50;

 void change(int data){
 data=data+100;
 }
   
  
 public static void main(String args[]){
   CallByVal op=new CallByVal();

   System.out.println("before change "+op.data);
   op.change(500);
   System.out.println("after change "+op.data);

 }
}