package member;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public EchoServer() {
		// java.io, java.net, java.sql은 대부분 예외가능 가능성이 있는 생성자 또는 메소드 : try-catch문 사용
		try {
			int port = 8000;
			int cnt = 0;
			ServerSocket server = new ServerSocket(port);
			System.out.println("ServerSocket Start....");
			while(true) {
				// client가 접속할 때까지 대기상태(커서가 깜빡이는 것)
				Socket sock = server.accept();
				EchoThread client = new EchoThread(sock);
				client.start(); // run 호출
				cnt++;
				System.out.println("Client " + cnt + " Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 내부클래스로 Client의 대응을 각각하기 위해 Thread 기능의 class를 생성
	class EchoThread extends Thread {
		Socket sock;
		BufferedReader in; // Client가 보내는 요청을 받는 스트림
		PrintWriter out;	// Client로 응답을 보내는 스트림
		
		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(),true/*auto flush*/);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				// Client가 접속하면 처음으로 받는 메시지
				out.println("Hello! Enter BYB to Exit");
				while(true) {
					//Client가 메시지 보낼 때까지 대기 상태
					String line = in.readLine();
					
					if (line == null) { // Clinet가 접속을 끊을 때
						break;
					} else {
						out.println("Echo : " + line);
						if (line.equals("BYB")) {
							break;
						}
					}
				}// --while
			} catch (Exception e) {
				e.printStackTrace();
			}
		}// --run()
	}// EchoThread
	
	public static void main(String[] args) {
		new EchoServer();
	}
}




















