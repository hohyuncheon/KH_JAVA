package kh.java.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class NetworkTest {

	public static void main(String[] args) {
		NetworkTest n = new NetworkTest();
//		n.test1();
//		n.test2();
		n.test3();
		
	}
	
	/*
	 * URL연결 요청
	 * -> 파일로 저장해보기
	 * 
	 */
	private void test3() {
		String address = "https://search.naver.com/search.naver?where=nexearch&query=%EA%B9%80%EB%B3%91%EC%9A%B1&sm=top_lve.ag20sgrpmamsipenmspm&ie=utf8";
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));//내가 외부의 연결로부터 작성한 url을 읽어내는 코드.
			BufferedWriter bw = new BufferedWriter(new FileWriter("search_result.html"));
			
			
			
			String data = "";
			while((data = br.readLine()) !=null) {
				//읽어온 것을 한줄씩쓰기작업
				bw.write(data);
				bw.write("\n");
				
				System.out.println(data);
			}
			//close안씀 강사님꺼 참고
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * URL
	 * protocol + hostname + port + 자원path
	 * 
	 * https://
	 * docs.oracle.com
	 * :443 ----> 프로토콜에 대한 기본포트는 생략가능  https-443, http-80, ftp-20...
	 * /javase/8/docs/api/java/util/ArrayList.html
	 * 
	 * protocol : 통신규약  http https ftp....
	 * 
	 * port : 서비스번호. 컴퓨터내에 특정프로그램을 가리키는 논리적인 번호 , 생략된 경우 많음? 보이지않음.
	 * 
	 */
	
	private void test2() {
		try {
			
//			URL url = new URL("https://docs.oracle.com:443/javase/8/docs/api/java/util/ArrayList.html");
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EB%82%98%EC%9D%B4%ED%82%A4");
			System.out.println(url.getProtocol()); //프로토콜 출력 https
			System.out.println(url.getHost());//도메인 부분만 출력//docs.oracle.com
			System.out.println(url.getPort() != -1 ? url.getPort() : url.getDefaultPort());//443
			System.out.println(url.getPath());///javase/8/docs/api/java/util/ArrayList.html
			System.out.println(url.getQuery());//사용자의 입력값을 가져옴 ?뒤쪽으로 사용자 입력값이므로 그 뒤를 가져옴.
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * InetAddress
	 * IP주소에 대한 정보를 가진 클래스
	 * 
	 * - ip : 10.10.10.10 4바이트로 이루어진 실제 주소 
	 * - hostname : naver.com, iei.or.kr
	 * 
	 * 모든 메소드가 static!
	 */
	
	//호스트네임으로 네이버 아이피 주소 찾아오기.
	public void test1() {
		try {
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println(naver.getHostAddress());//아이피주소
			
			//도메인의 모든 서버 ip 주소 알아내는 방법.
			InetAddress[] arr = InetAddress.getAllByName("naver.com");
			System.out.println(arr.length);//결과 서버가 4군데에 있음.
			
			for(InetAddress ip : arr)//포이치문으로 ip주소 다 출력해냄.
				System.out.println(ip.getHostAddress());
			
			//내컴퓨터의 ip주소
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println("내아이피주소 : " +localhost.getHostAddress());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

