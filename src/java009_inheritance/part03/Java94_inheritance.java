package java009_inheritance.part03;

public class Java94_inheritance {

	public static void main(String[] args) {
		SubConst sc = new SubConst(); 
		// SubConst클래스로 불러왔기 때문에 SubConst의 값을 먼저 읽고 그에 해당하는 타입이 없으면 상속받은 곳에서 값을 찾아 읽는다.
		System.out.printf("x=%d, y=%d \n", sc.x, sc.y);
	}

}
