package java001;
	
class Seoul{
	public void showyou() {
		System.out.println("seoul");
	}
}
class Fruit extends Seoul{
	public void showyou() {
		System.out.println("orange");
	}
}
class Apple extends Fruit {
	public void showyou() {
		System.out.println("apple");
	}
}
class Orange extends Fruit {
	public void showyou() {
		System.out.println("orange");
	}
	
}


class Fruitbox<T>{
	private T item;
	
	public Fruitbox() {
		
	}
	public void store(T item) {
		this.item = item;
	}
	public T pullout() {
		return item;
	}
}


public class main053 {
	
	public static void main(String[] args) {
		/*
		 * 와일드 카드 : 컬럴션에 제공되는 특정한 객체로 정해진 상태에서 다른 객체형은 저장할수 없는 상태
		 */

	}

}
