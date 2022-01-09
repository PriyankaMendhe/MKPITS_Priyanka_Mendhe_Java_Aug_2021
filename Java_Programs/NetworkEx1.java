import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress obj=InetAddress.getLocalHost();
        System.out.println(obj);
        System.out.println(obj.getHostName());
        System.out.println(obj.getHostAddress());
        System.out.println(obj.getByName("www.google.com"));
        System.out.println(obj.getLoopbackAddress());
    }
}