package network.chat;


import java.io.*;
import java.util.*;
import java.net.*;

public class ChatServer implements Runnable {
	ArrayList vc = new ArrayList();

	public void run() {
		ServerSocket ss = null;
		try{
			ss = new ServerSocket(1234);
			System.out.println("Server open");
		}catch( Exception e ) {
			System.out.println(e);
		}
		
		while(true) {
			try{
				Socket s = ss.accept();
				System.out.println("Client 가 접속시도 :" + s );
				ChatService cs = new ChatService(s);
				cs.start();
				vc.add(cs);
			
			} catch( Exception e ) { }
		}
	}  // run ends
	
	public static void main( String [] arg ) {
		ChatServer cs = new ChatServer();
		new Thread(cs).start();
	}



class ChatService extends Thread {
		String myname = "guest";
		BufferedReader in;
		OutputStream out;
		ChatService( Socket s ) {
			try{
				in = new BufferedReader( new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
			}catch( Exception e ) { }
		}// 생성자 종료
		
	

	public void run() {
		while(true) {
			try{
				String msg = in.readLine();
				if( msg == null ) return;
				StringTokenizer st = new StringTokenizer(msg);
				if( st.countTokens() > 1 ) {
					String temp = st.nextToken();
					
					if( temp.equalsIgnoreCase("/name" )) { // IgnoreCase : 대소문자구별하지않음
						temp = st.nextToken();
						putMessageAll(myname + "님의 이름이 " + temp + "으로 바뀌었습니다.");
						myname = temp;
						changeList();
						continue;
					}else if(temp.equals("/enter")){ // 맨처음 방에 들어왔을때 
						myname = st.nextToken();
						putMessageAll(myname + "님이 입장했다옹");
						
						//멤버리스트 전송 
						changeList();
						continue;
					}
					//클라이언트 종료시
					else if(temp.equals("/exit")){
						putMessageAll(myname + "님이 나갔져용");
						vc.remove(this);
						changeList();
						continue;
					}
					

				}
				
				putMessageAll( myname + ">" + msg );
			
			}catch( Exception ex ) { return; }
			
		}
	}// run ends
	
	// 모든 클라이언트의 별칭들을 전송
	void changeList(){
		String msg = "/member  ";
		for (int i = 0; i < vc.size(); i++) {
			ChatService cs = (ChatService)vc.get(i);
			msg += cs.myname + "  ";
		}
		putMessageAll(msg);
	}/// changeList end 

	void putMessageAll( String msg ) {
		for( int i =0 ; i<vc.size() ; i++ ) {
			ChatService cs = ( ChatService ) vc.get(i);
			
			try {
				cs.putMessage(msg);
			}catch( Exception e ) {
				vc.remove(i--);
			}
		}
	} // putMessageAll ends
	
	
	void putMessage( String msg )
		throws Exception {
			out.write( (msg+"\r\n").getBytes() );
		}

 } // ChatService class ends
	
	
}// ChatServer class ends
