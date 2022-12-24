import java.io.*;
import java.net.*;
import java.util.*;

class dataGramServer {
    public static void main(String... args) throws Exception {
        byte[] b = new byte[1024];
        System.out.println("Starting Server...");
        DatagramSocket ds = new DatagramSocket(3131);
        InetAddress ia = InetAddress.getLocalHost();
        System.out.print("Enter a Message: ");

        b = new Scanner(System.in).nextLine().getBytes();

        System.out.println("Sending Packet from Server...");
        ds.send(new DatagramPacket(b,b.length,ia,6363));
        
    }
}