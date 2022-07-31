

/*public static void main(String[] args){
       int x=10;           |                     |
}           |                 |                        |
       Identifiers    Identifiers  Identifiers

*/

class Identifiers
{
	public static void main(String[] args) 
	{   
		//String[] args;------------error: variable args is already defined in method main(String[])
		int[] a;
		//int a=10;-------error: variable a is already defined in method main(String[])
		int b=10;
		System.out.println("Hello World!");//SOPln()
	}
}