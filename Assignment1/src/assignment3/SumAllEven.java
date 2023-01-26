package assignment3;

import java.util.*;

public class SumAllEven
{ 
public static void main(String[] args) {
	
	int n, sum = 0;
    
    System.out.println("Enter a number");
    
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    
    
    
    for(int i = 1; i <= n; i++) {
        
        
        if(i % 2 != 0) 
        
        {
            sum = sum + i;
        }
        
    }
    
    System.out.println("The sum of all even numbers between 1 to " + n + " is " + sum);
}

}
