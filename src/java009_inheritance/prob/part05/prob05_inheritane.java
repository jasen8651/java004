package java009_inheritance.prob.part05;

/*
 * 
 * 아래와 같이 구현하세요
 * [출력결과 1]
 * 아티스트	소속사			콘서트장		좌석		가격
 * 블랙핑크	yg엔터테인먼트		잠실종합운동장	A-21	185000
 * 아이유		EDAM엔터테인먼트	부산사직체육관	C-10	155000
 * BTS		빅히트 뮤직		    올림픽체조경기장	S-19	240000
 * PSY		피네이션			코엑스		B-04	189000
 * ZICO		KOZ엔터테인먼트		잠실종합운동장	A-11	150000
 * 
 * [출력결과 2]
 * 아이유 부산사직체육관 C-10좌석의 가격은 155000원입니다.
 * BTS 올림픽체조경기장 S-19좌석의 가격은 240000원입니다.
 */
public class prob05_inheritane {

	public static void main(String[] args) {
		Concert[] con = new Concert[5];
		con[0] = new Concert("블랙핑크","YG엔터테인먼트","잠실종합운동장","A-21",185000);
		con[1] = new Concert("아이유","EDAM엔터테인먼트","부산사직체육관","C-10",185000);
		con[2] = new Concert("BTS","빅히트 뮤직","올림픽체조경기장","S-19",240000);
		con[3] = new Concert("PSY","피네이션","코엑스","B-04",189000);
		con[4] = new Concert("ZICO","KOZ엔터테인먼트","잠실종합운동장","A-11",150000);
	
		System.out.printf("아티스트         소속사        콘서트장        좌석        가격 \n");
		for(Concert cc : con)
		System.out.println(cc.toString());
		
		Concert myCon1 = new Concert("아이유","EDAM엔터테인먼트","부산사직체육관","C-10",185000);
		myCon1.prn();
		Concert myCon2 = new Concert("BTS","빅히트 뮤직","올림픽체조경기장","S-19",240000);
		myCon2.prn();
		
	}

}
