import java.io.*;
class test
{
	public static void main(String args[])throws IOException
	{
		String a;
		System.out.println("Enter the string");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=br.readLine();
		for(int i=0;i<a.length();i++)
		{
			if(i>1)
				System.out.print(a.charAt(i));
			else if(a.charAt(i)!='A')
				System.out.print(a.charAt(i));
		}
	}
}