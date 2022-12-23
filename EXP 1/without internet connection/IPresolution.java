import java.net.InetAddress;
class IPresolution {

    public static void main(String... args) throws Exception {
  
        InetAddress host = InetAddress.getLocalHost();
        System.out.println("Host name: "+host.getHostName());
        System.out.println("IP Address is: " + host.getHostAddress());
    }
}