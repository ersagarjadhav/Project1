package assignment14jan;

public class RotateArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Before Shifting");
		
		int arr[]= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
		System.out.println(" ");
		
		
		int temp=arr[0];
		//shift one element to left
		System.out.println("After shifting");
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		
		//store print value in last position
		arr[arr.length-1]=temp;
		
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
	}

}
