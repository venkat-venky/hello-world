class Demo2
{
	int a=3;
	public void test()
	{
		System.out.println("test method ended");
	}
	public void disp()
	{
		test();
		System.out.println("a="+a);
		System.out.println("disp method ended");
	}
}
class Program4
{
	public static void main(String []args)
	{
	System.out.println("main method started");
	Demo2 result=new Demo2();
	result.disp();
	System.out.println("main method ended");
}
}