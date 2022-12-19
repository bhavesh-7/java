import java.net.*;
import java.io.*;
import java.util.*;
public class ClientSide{
	public static void main(String[] args) throws IOException{
		Socket soc = new Socket("localhost",9999);
		PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
		BufferedReader in = new BufferedReader( new InputStreamReader(soc.getInputStream()));

		Scanner get = new Scanner(System.in);
		String nm = get.nextLine();
		out.println(nm);
		System.out.println(in.readLine());
	}
}
		
