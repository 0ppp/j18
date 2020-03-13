class MyNumber
{
	private int data;
	public MyNumber(){
		data=0;
	}
	
     public MyNumber(int xdata)
     {
     	data=xdata;
     }
	
	String isNegative()
	{
		if(data<0) 
			return (""+data+" is Negative");
			else
			return (""+data+" is Not Negative");
				
	}
	
		String isPositive()
	{
		if(data>=0) 
			return (""+data+" is Positive");
			else
			return (""+data+" is Not Positive");
				
	}
	
		String isZero()
	{
		if(data==0) 
			return (""+data+" is ZERO");
			else
			return (""+data+" is Not ZERO");
				
	}
	
		String isOdd()
	{
		if(data%2!=0) 
			return (""+data+" is odd");
			else
			return (""+data+" is Not odd");
				
	}
	
			String isEven()
	{
		if(data%2==0) 
			return (""+data+" is Even");
			else
			return (""+data+" is Not Even");
				
	}
}

class s18_1
{
	
	public static void main(String args[]) throws Exception
	{
		MyNumber obj= new MyNumber(Integer.parseInt(args[0]));
		System.out.println(obj.isNegative());
		System.out.println(obj.isPositive());
		System.out.println(obj.isZero());
		System.out.println(obj.isOdd());
		System.out.println(obj.isEven());
	}
	
}