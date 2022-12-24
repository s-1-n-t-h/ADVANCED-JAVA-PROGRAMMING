import java.io.*;
import java.net.*;

class dataGramClient {
    public static void main(String... args) throws Exception {
        byte[] b = new byte[1024];
        System.out.println("Starting Client...");
        DatagramSocket ds = new DatagramSocket(6363);
        DatagramPacket dp = new DatagramPacket(b, b.length);
        System.out.println("Waiting for Packet from Server...");
        ds.receive(dp);
        System.out.println("Message from Server: " + new String(dp.getData()));

    }
}