import java.io.*;
import java.net.*;

class UpperClient
{
	public static void main(String [] args) throws
	UnknownHostException, IOException
	{	
		Socket soc=new Socket("localhost", 9999);
		PrintWriter out=new PrintWriter(soc.getOutputStream(), true);
		BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));

		BufferedReader Gin= new BufferedReader(new InputStreamReader(System.in));
		
		String userInput;
		while((userInput=Gin.readLine()) != null)
		{
			out.println(userInput);
			System.out.println(in.readLine());
		}	
	}
}