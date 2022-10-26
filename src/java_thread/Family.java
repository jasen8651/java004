package java_thread;
//공유자원
public class Family extends Thread {

private Wahroom wr;
private String who;

public Family() {
	// TODO Auto-generated constructor stub
}

public Family(Wahroom wr, String who) {
	this.wr= wr;
	this.who= who;
	}

 	@Override
 		public void run() {
 			wr.openDoor(who);
 		}
	
}