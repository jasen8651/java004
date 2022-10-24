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
		 * verctor v  = new Verctor();
		 * 
		 * 구성 <?> 모든 객체자료형에 대한 베치를 의미'
		 * <? super> 명시된 객체자료형이나 상위객체들을 배치
		 * <? extends > 명시된 객체자료형이나 객체자룧ㅇ을보 상속받은 하위객체배치의미
		 */
		Fruitbox<Orange> forange = new Fruitbox<Orange>();
		forange.store(new Orange());
		openAndAllbox(forange);
		openAndExtendsbox(forange);
		//openAndsuperbox(forange);
		
	}
	public static void openAndAllbox(Fruitbox<?> param) {
		System.out.println(param.pullout());
		((Seoul)param.pullout()).showyou();
	}
	public static void openAndExtendsbox(Fruitbox<? extends Fruit> param) {
		param.pullout().showyou();
	}
	public static void openAndsuperbox (Fruitbox<? super Fruit> param) {
		
	}
	
}
