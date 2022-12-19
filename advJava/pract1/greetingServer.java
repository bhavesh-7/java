import java.net.*;
import java.io.*;

public class greetingServer{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(9999);
        Socket soc = ss.accept();
        
        PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        
        String InputLine = in.readLine();
        System.out.println("Recieved: "+InputLine);
        String GreetingMsg = "Welcome To My First Advance Java Practical " + InputLine;
        out.println(GreetingMsg);
    }
}
