public class CallByRef{
 int data=50;

 void change(CallByRef op){
 op.data=op.data+100;//changes will be in the instance variable only
 }
   
  
 public static void main(String args[]){
   CallByRef op=new CallByRef();

   System.out.println("before change "+op.data);
   op.change(op);//passing object
   System.out.println("after change "+op.data);

 }
}