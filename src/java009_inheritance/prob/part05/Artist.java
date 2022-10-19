package java009_inheritance.prob.part05;

public class Artist {
	String artist; // 아티스트
	String enter; // 소속사

	public Artist() {

	}

	public Artist(String artist, String enter) {
		this.artist = artist;
		this.enter = enter;
	}

	public void prn() {
		System.out.printf("%s에 소속된 가수는 %s이다. \n", enter, artist);
	}

}
