class LinearSearch1 {

	public static void main(String args[]) {
		
		int x = 9, i;
		int arr[] = {1,3,4,5,7,6,9};
		for(i=0; i<arr.length; i++)
		{
			if(arr[i] == x)	
				
			{
				System.out.println("Element found at index: " + i);
				break;
			}
	
		}
		if (i == arr.length)
	        System.out.println(x + " doesn't exist in array.");

	}
}
