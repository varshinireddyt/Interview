package interview.stack;

public class DStack {
	
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	
	public void push(int num)
	{
		if(size() == capacity )
		expand();
		stack[top] = num;		
//		System.out.println(stack[top]);
		top++;
		
	}
	
	public void expand()
	{
		int length = size();
		int newStack[] = new int[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity *= 2;
	}
	
	public void show() 
	{
		
		for(int n: stack)
		{
			System.out.print(n + " ");
		}
	}
	
	public void shrink() 
	{
		int length = size();
		if(length<=(capacity/4)) 
			capacity = capacity/2;
			
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
	}
	
	public void pop()
	{
		int data;
		top--;
		data = stack[top];
		stack[top] = 0;
		shrink();

	}
	
	public void peek()
	{
		int data;
		data = stack[top-1];
		System.out.println("peek number " + data);
	}
	
	public int size()
	{
		return top;
	}

}
