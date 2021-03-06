package callback;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CallbackDigest implements Runnable{ //callback은 쓰레드가 종료될때 새로운 메소드를 호출한다.
	
	private String filename;
	CallbackDigestUserInterface callback;
	
	public CallbackDigest(String filename, CallbackDigestUserInterface callback){
		this.filename = filename;
		this.callback=callback;
	}
	
	public void run(){
		FileInputStream in;
		try{
			MessageDigest sha  = MessageDigest.getInstance("SHA-256");
			in = new FileInputStream(filename);
			DigestInputStream din = new DigestInputStream(in, sha);
			while(din.read() != -1);
			din.close();
			byte[] digest = sha.digest();
			this.callback.receiveDigest(digest, filename);
		} catch(IOException ex){
			ex.printStackTrace();
			System.err.println(ex);
		} catch(NoSuchAlgorithmException ex){
			ex.printStackTrace();
			System.err.println(ex);
		}
	}
}
