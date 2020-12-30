class Strange
	{
	static String[] strangeSort(int mapping[],String nums[])
	{
		int mapped[]=new int[10]; //creating array to store mapping number for each digit
		for(int i=0;i<10;i++)
		{
			mapped[mapping[i]]=i; //storing mapping number for each digit
		}
	int sorter[]=new int[nums.length]; //to store mapped number for each String
	//mapping every String to a integer
	for(int i=0;i<nums.length;i++)
	{
		String s="";
		for(int j=0;j<nums[i].length();j++)
			s+=mapped[(int)nums[i].charAt(j)-48];
		sorter[i]=Integer.parseInt(s);
	}
	//sorting the integer and the nums array
	for(int i=0;i<nums.length-1;i++)
	{
		for(int j=0;j<nums.length-i-1;j++)
		{
			if(sorter[j]>sorter[j+1])
			{
				int temp=sorter[j];
				sorter[j]=sorter[j+1];
				sorter[j+1]=temp;
				String temp1=nums[j];
				nums[j]=nums[j+1];
				nums[j+1]=temp1;
}
}
}
return nums; //returning sorted array
}