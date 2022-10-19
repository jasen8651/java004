package java011_casting.part01;

/*
 * 데이터 타입
 * 1 primitive data type(기본데이터타입) : byte, short, int, long, float, double, boolean, char
 * 2 reference data type(참조데이터타입) : array, class, interface
 * 
 * 인자전달방식
 * 1 call by value : 값에 의한 복사 - 기본 데이터 타입
 * 	 void add(int a, int b){}
 *   
 *   
 * 2 call by reference : 주소에 의한 복사 - 참조 데이터 타입
 *   void process(int[] arr){}
 *   process(new int[]{1,2,3});
 * 
 * 형변환(casting) - 기본 데이터 타입
 * 1 묵시적 형변환 : 작 -> 큰
 * 2 명시적 형변환 : 큰 -> 작
 *   int num = 3;
 *   double data = num; // 묵시적 형변환
 *   short val = (short)num;  // 명시적 형변환
 *   
 * 객체형변환 - 참조데이터 타입
 * 1 상속관계일때 형변환이 가능하다.(is a)
 * 2 업캐스팅 발생된 후 다운캐스팅을 할 수 있다.
 *   - 업캐스팅(up-casting) : 부모객체로 자식객체를 참조하도록 형변환하는 기술
 *   - 다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀하여 형변환하는 기술
 *   - 다운캐스팅이 발생이 되려면 업캐스팅이 먼저 발생해야 한다.
 */
public class Java109_casting {

	public static void main(String[] args) {
		// SampleA sa = new SampleA();
		// SampleB sb = new SampleB();
		// sa = sb;
		// sa = (SampleA)sb;

		Parent p = new Parent();
		Child c = new Child();
		
		// Parent p = new Child();
		p = c; // 업캐스팅(up-casting)
		p.process();
		// p.call();
		
		Child d = (Child)p; // 다운캐스팅(down-casting)
		d.call();
		d.process();
		
		System.out.println("=========");
		
		// 객체 생성 및 업캐스팅
		Parent pt = new Child();
		pt.process();
		// pt.call();
		
		// 다운캐스팅
		Child cn = (Child)pt;
		cn.call();
		
	}

}
