package assment31_dec;



public class ThisUsingVar {
	
	int a=5;
         
	void method(int a)
    {   int c=10;
    	System.out.println(" Instance variable value is"+this.a);
    	System.out.println("local Variable"+c);
    	
    }
    void method()
    {
    	int b=4;
    	System.out.println(" the value of instance variable"+this.a);
    	System.out.println("the value of local variable is"+b);
    	
    }
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisUsingVar obj=new ThisUsingVar();
		obj.method();
		obj.method(50);
		
	    
	    
	    
	    
	

	}

}
