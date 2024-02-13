public class NestedLoop {
	
	public static void main(String[] args)
	{
		 int k=1;
		for(int i=0;i<4;i++)
		{
			
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	
	
	int d=1;
	for(int e=1;e<=4;e++)
	{
		
		for(int f=1;f<=e;f++)
		{
			System.out.print(d+" ");
			d++;
		}
		System.out.println();
	}
	
	//int a=1;
	for(int b=4;b>0;b--)
	{
		
		for(int c=1;c<=5-b;c++)
		{
			System.out.print(c+" ");
			
		}
		System.out.println();
	}
	for(int p=1;p<=4;p++)
	{
		
		for(int q=1;q<=p;q++)
		{
			System.out.print(q+" ");
			
		}
		System.out.println();
	}
	
}}