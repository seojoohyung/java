package Kr.or.ddit.baisc;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
*/
public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		
		//inetAddress  클래스 => IP 주소를 ㄷ다루기 위한 클래스 \
		
		//naver 사이트의 ip 정보 ㄱ가져오기
		InetAddress naverIp = InetAddress.getByName("www.naver.com");
		
		// machine name 또는 텍스트 형식의 ip 주소 반환 
		System.out.println("Host Name => " + naverIp.getHostName());
		System.out.println("Host address => "+ naverIp.getHostAddress());
		System.out.println();
		
		//자기 자신 컴퓨터의 IP 저옵 가져ㅛ오기 
		InetAddress localIp = InetAddress.getLocalHost();
		System.out.println("내 컴츄터의 Host name => " + localIp.getHostName());
		System.out.println("내 컴터의 HostAddress => "+  localIp.getHostAddress());

		//ip 주소가 여러개인 호스트의 정보를 가져
		
		InetAddress[] naverIps = InetAddress.getAllByName("www.naver.com");
		for(InetAddress nIp: naverIps) {
			System.out.println(nIp.toString());
			
		}
	}
}
