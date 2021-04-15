package Kr.or.ddit.baisc;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/**
*/
public class URLTest {
	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		//URL 클래스 => 인터넷에 존재하는 서버들의 자원에 접근할수 있는 주소를 관리하는 클래스 
		
		//http"//ddit.or.kr:80/index.html?ttt=123
		URL url = new URL("http","ddit.or.kr",80,"main/index.html?ttt=123#kkk");
		System.out.println("전체 URL 주소 : " + url.toString());
		
		System.out.println("protocol : " + url.getProtocol());
		System.out.println("host : " + url.getHost());
		System.out.println("query : " + url.getQuery());
		System.out.println("file : " + url.getFile());
		System.out.println("path : " + url.getPath());
		System.out.println("port : " + url.getPort());
		System.out.println("ref : " + url.getRef());
		System.out.println();
		
		System.out.println(url.toExternalForm());
		System.out.println(url.toString());
		System.out.println(url.toURI().toString());
		
		
	}
}
