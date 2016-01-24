package printAddr;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class printAddr {
	public static void main(String args[]){
		try{
			InetAddress address = InetAddress.getByName("www.kangwon.ac.kr");
			System.out.println(address);
			InetAddress address1 = InetAddress.getByName("192.203.114.27");
			System.out.println(address1);
		}catch(UnknownHostException ex){
			System.out.println("Could not find www.kangwon.ac.kr");
		}
	}
}
