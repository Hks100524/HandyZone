import java.net.*;
class InetAddressTest
{
public static void main(String args[]) throws UnknownHostException
{
IP address
domain name
InetAddress address = InetAddress.getLocalHost();
System.out.println(address);
address = InetAddress.getByName("yahoo.com");
System.out.println(address);
InetAddress SW[] = InetAddress.getAllByName("www.gmail.com");
for (int i=0; i<SW.length; i++)
System.out.println(SW[i]);
}
}
