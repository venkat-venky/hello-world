class demo1
{
	int a;
	demo1(int c)
	{
		super();
		System.out.println("executing super class");
		a=c;
	}
}
class demo2 extends demo1								//super class is unvisible we cn write or it will be defualt
{
	int b;												//if we can call another constructor by giving a data type and value 
	demo2()
	{
		super(23444);
		System.out.println("executing sub class ");
		b=12345;
	}
}
class Program4
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		demo2 d2=new demo2();
		System.out.println("a="+d2.a);
		System.out.println("b="+d2.b);
		System.out.println("main method started");
	}
}