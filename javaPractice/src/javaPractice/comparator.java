package javaPractice;

class comparator {
	
		boolean compare (int a, int b)
		{
			if(a==b)
			{
				return true;
			}
			return false;
		}
		boolean compare (String a, String b)
		{
			if(a.equals(b))
			{
				return true;
			}
			return false;
		}
		boolean compare(int a[], int b[])
		{
			if(a.length!=b.length)
			{
				return true;
			}
			for(int i=0;i<=a.length;i++)
			{
				if(a[i]!=b[i])
				{
					return false;
				}
			}
			return false;
		
		}
	
}




