import java.net.*;
import java.util.*;
import java.io.*;

class client{ 

    public static void main(String... args) throws Exception{
        System.out.println("Starting Client...");
        Socket c = new Socket("localhost",6363);
        BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
        System.out.println("Message Recived from Server: "+br.readLine());
        c.close();

    }
    
}
