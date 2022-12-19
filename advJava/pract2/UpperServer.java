import java.io.*;
import java.net.*;

class UpperServer
{
	public static void main(String []args) throws IOException
	{
		ServerSocket ss = new ServerSocket(9999);
		Socket soc = ss.accept();

		PrintWriter out= new PrintWriter(soc.getOutputStream(), true);
		BufferedReader in= new BufferedReader(new InputStreamReader(soc.getInputStream()));
		
		String inputLine;
		while((inputLine=in.readLine()) != null)
		{
			System.out.println("Recieved: " +inputLine);
			out.println(inputLine.toUpperCase());
		}
	}
}
