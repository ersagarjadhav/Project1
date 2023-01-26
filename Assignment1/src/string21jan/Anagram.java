package string21jan;

public class Anagram {

	public static void main(String[] args) {
		String s="Silent";//keep
		String s1="Listen";//Anagram string
		int flag=0;
		int count=0;
		
		String str1=s.toLowerCase();
		
		String str2=s.toLowerCase();
		
		
	char arr[]=	str1.toCharArray();
	char  arr1[]=str2.toCharArray();
	
	
		
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j]) {
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=i+1;j<arr1.length;j++)
		{
			if(arr1[i]>arr1[j]) {
				char temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
			}
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==arr1[i])
		{
			count++;
			flag=1;
		}
	}
	if(flag==1 && count==arr1.length)
	{
		System.out.println("Anagram");
	}
	else
		System.out.println("not");
	
		
	}

}
