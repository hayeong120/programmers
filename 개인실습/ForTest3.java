class ForTest3
{
	public static void main(String args[])
	{
		int i;

   		System.out.println("홀수:");
			for(i=1; i<=20; i++)
			{
				if(i % 2 == 1)
				{
				 	System.out.println(i);
				}
			}

		System.out.println(" ");

		System.out.println("짝수:");
			for(i=1; i<=20; i++)
			{
				if(i % 2 == 0)
				{
					System.out.println(i);
				}
			}
	}
}