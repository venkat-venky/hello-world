class Program6     //using switch case//
{
	public static void main(String []args)
	{
		char grade='B';
		switch (grade)
		{
		case 'A': System.out.println("first class with distingstion");
		break;
		case 'B': System.out.println("only first class");
		break;
		case 'C': System.out.println("second class");
		break;
		case 'D': System.out.println("third class");
		break;
		default : System.out.println("fail");
		break;
		}
	}
}