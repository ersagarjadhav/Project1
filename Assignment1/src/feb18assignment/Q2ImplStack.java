package feb18assignment;

public class Q2ImplStack {
	

	int top;
	int len;
	int []stack;
	Q2ImplStack()
	{
		top = -1;
		len = 10;
		stack = new int[len];
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
	public boolean isFull()
	{
		return top == len-1;
	}
	public int push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack Is Full");
		}
		return stack[++top] = data;
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Is Empty");
		}
		return stack[top--];
	}
	public int peek()
	{
		return stack[top];
	}
	
	public static void main(String[] args) {
	
		Q2ImplStack ob=new Q2ImplStack();
		ob.push(10);
		ob.push(54);
		ob.push(99);
		ob.push(36);

		System.out.println(ob.isEmpty());
		System.out.println(ob.isFull());
		System.out.println(ob.len);
		System.out.println(ob.peek());
		System.out.println(ob.pop());
		
	}

}