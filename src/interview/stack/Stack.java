package interview.stack;

public class Stack 
{
	int stack[] = new int[5];
	int top = 0;
	
	public void push(int num)
	{
		stack[top] = num;		
//		System.out.println(stack[top]);
		top++;
	}
	
	public void show() 
	{
		
		for(int n: stack)
		{
			System.out.print(n + " ");
		}
	}
	
	public void pop()
	{
		int data;
		top--;
		data = stack[top];
		stack[top] = 0;

	}
	
	public void peek()
	{
		int data;
		data = stack[top-1];
		System.out.println("peek number " + data);
	}
	
	public void size()
	{
		System.out.println("Size is: " + top);
	}
}
