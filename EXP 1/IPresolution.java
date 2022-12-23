import java.net.InetAddress;
import java.util.Scanner;
class IPresolution{

    public static void main(String... args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter host name: ");
        String hostName = sc.nextLine();
        InetAddress host = InetAddress.getByName(hostName);
        System.out.println("IP Address is: "+host.getHostAddress());
    }
}