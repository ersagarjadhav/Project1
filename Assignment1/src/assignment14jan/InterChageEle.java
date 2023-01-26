package assignment14jan;

import java.util.Arrays;
import java.util.Scanner;

public class InterChageEle {

	public static void main(String[] args) {
		

	Scanner sc=new Scanner(System.in);
	
	   System.out.println("Enter the number of elements in the first array :");
	 	int size1=sc.nextInt();
	 	int arr1[]= new int [size1];
	 	int i=0; 
		System.out.println("Enter the number of elements in the Second array :");
	    int size2=sc.nextInt();
		int arr2[]= new int[size2];
		System.out.println("Enter the elements in the first array");
       for ( i=0;i<arr1.length;i++)
        	
         {   
        	System.out.println("Enter the Element");
        	arr1[i]=sc.nextInt();
         }
       for ( i=0;i<arr1.length;i++)
       {
        	System.out.println("Enter the Elements of 2nd array");
        	arr2[i]=sc.nextInt();
         }	
        	
       int  temp; 
      
       if(arr1.length==arr2.length)
       {
            for( i=0;i<arr1.length;i++)
            {
    	    
         	   temp=arr1[i];
         	   arr1[i]=arr2[i];
         	   arr2[i]=temp;
         	   
    	    }
       }System.out.println("  "+Arrays.toString(arr1));
       System.out.println("  "+Arrays.toString(arr2));	  
    	    
                 
       
    	 
      
         	 
       
      
        
        
        
	}
}
