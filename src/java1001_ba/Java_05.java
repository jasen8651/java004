package java1001_ba;

public class Java_05 {

	public static void main(String[] args) {
		/*
		 * 
		 * Ctrl + shift + B : 현재 커서위치에 Break point설정/해제
		 * Ctrl + Shift + F : 소스코드 자동 정리
		 * Ctrl + Shift + G : 현재 커서가 위치한 특정 메써드나 객체, 필드를 Reference하고 있는 곳을 찾는다.
		 * Ctrl + Shift + J : 검색할 단어를 입력하면서 실시간으로 거꾸로 검색
		 * Ctrl + Shift + K : 이전찾기 (또는, 찾고자하는 문자열을 블럭으로 설정한 후 역으로 찾고자 하는 문자열을 찾아감.)
		 * Ctrl + Shift + L : 단축키 보기 HintCtrl + Shift + M : 캐럿이 위치한 대상에 필요한 특정 클래스 Import 시키기
		 * Ctrl + Shift + O : 소스에 필요한 패키지를 자동으로 Import 시키기
		 * Ctrl + shift + R : Open Resource. 모든 프로젝트에서 파일명 검색.
		 * Ctrl + Shift + S : 열려진 모든파일 저장 및 컴파일
		 * Ctrl + Shift + / : 선택 영역 Block Comment 설정
		 * Ctrl + Shift + \ : 선택 영역 Block Comment 제거
		 * Ctrl + Alt + RCtrl + Alt + up/down : 한줄 duplicateCtrl + F11 : 실행
		 * Ctrl + 1 : Quick Fix. 에러가 발생했을 경우 Quick Fix를 통해 쉽게 해결이 가능하다.(Rename에 주로 사용)
		 * Ctrl + 2 + R : Rename (리팩토링)
		 * Ctrl + / : 한줄 또는 선택영역 주석처리 / 제거
		 * Ctrl + . : 다음오류부분으로 가기
		 * Ctrl + , : 이전오류부분으로 가기
		 * Ctrl + D : 한줄삭제
		 * Ctrl + H : Find 및 ReplaceCtrl + I : 소스 깔끔 정리(인덴트 중심의 자동구문정리)
		 * Ctrl + J : 검색할 단어를 입력하면서 실시간으로 검색
		 * Ctrl + K : 다음찾기(또는, 찾고자 하는 문자열을 블럭으로 설정한 후 키를 누른다.)
		 * Ctrl + L : 특정줄번호로 가기
		 * Ctrl + N : 새로운 파일 및 프로젝트 생성
		 * Ctrl + O : Outline 창 열기
		 * Ctrl + Q : 마지막 편집위치로 가기
		 * Ctrl + S : 저장 및 컴파일
		 * Ctrl + space : 어휘의 자동완성(Content Assistance)
		 * Ctrl + 객체클릭(혹은 F3) : 클래스나 메소드 혹은 멤버를 정의한 곳으로 이동(Open Declaration)
		 * Alt + Shift + UP : 커서를 기준으로 토큰단위 블럭지정 (괄호의 열고 닫기 쌍 확인에 유용)  ==> 괄호의 뒤에 마우스 커서를 위치시킨 후 더블클릭한 것과 같은 효과
		 * Alt + Shift + DOWN : 커서를 기준으로이젠아카데미컴퓨터학원 강남 토큰단위 블럭해제
		 * Alt + Shift + J : 설정해 둔 기본주석을 자동으로 달기 (메소드나 멤버변수에 포커스 두고 실행)
		 * Alt + UP,DOWN : 현재 줄 위치 이동
		 * Alt + Shift + 방향 : 선택
		 * Alt + Shift + R : RenameAlt + / : Word CompletionAlt + ->, 
		 * Alt + <- : 이후, 이전해당 프로젝트에서 
		 * Alt + Enter : Project 속성sysout > Ctrl + Space : System.out.println();try > 
		 * Ctrl + Space : 기본 try-catch문 완성for > 
		 * Ctrl + Space : 기본 for문 완성템플릿을 수정, 추가 : Preferences > java > editor > 
		 * Templates
		 * F4 : 클래스명을 선택하고 누르면 해당 클래스의 Hierarchy 를 볼 수 있다.
		 * F5 : step into
		 * F6 : step over
		 * F8 : 디버깅 계속
		 * F11 : 디버깅 시작
		 * F12 : 에디터로 커서이동

		 */
		byte bNun =2;
		short sNun =4;
		int xNum =5;
		long lNum =6l; //l,L
		float fnum =2.5f; //F,f
		double dnum = 7.4;
		char cdata='k';
		boolean Fnum = true;  //true or false
		
		
		System.out.println(sNun);
		System.out.println(lNum);
		System.out.println(cdata);
		
		//묵시적 형 변환 
		//명시적 형 변환
	}

}
