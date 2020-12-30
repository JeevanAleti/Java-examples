public class BubbleSort {  
    public static void main(String[] args) {  
    int[] a = {10, 9, 7, 54, 8, 6};  
    for(int i=0;i<6;i++)  
    {  
        for (int j=1;j<6;j++)  
        {  
            if(a[j-1]>a[j])  
            {  
                int temp = a[j-1];  
                a[j-1]=a[j];  
                a[j] = temp;   
            }  
        }  
    }  
    System.out.println("Printing Sorted List ...");  
    for(int i=0;i<6;i++)  
    {  
        System.out.println(a[i]);}
    {
        System.out.println("array length:"+a.length);  
    }  
}  
}  