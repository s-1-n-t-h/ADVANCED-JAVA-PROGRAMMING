import java.io.*;
import java.net.*;
import java.util.*;

class server{

    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(6363);
        System.out.println("Server running...");

        System.out.println("Waiting for client to connect...");
        Socket c = s.accept();

        System.out.println("Client connected...");

        OutputStreamWriter osw = new OutputStreamWriter(c.getOutputStream());
        PrintWriter pw = new PrintWriter(osw);
        System.out.print("Enter a message: ");
        pw.println(new Scanner(System.in).nextLine());
        pw.flush();
        s.close();
    }
    
}
