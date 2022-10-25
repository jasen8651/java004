package ncs.test05;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book barray [] = new Book[3];
		
		barray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		barray[1] = new Book("열강의 자바", "구정은", 29000, "프리렉, ", 0.1);
		barray[2] = new Book("객체지향 java8", "금영옥", 30000, "북스홈, ", 0.1);
		
		for(int i=0; i<barray.length; i++) {
			System.out.println(barray[i].getTitle()+", "+barray[i].getAuthor()+", "+ barray[i].getPrice()+", "+barray[i].getPublisher()+"원");
			System.out.println("할인된 가격 "+ (int)((barray[i].getDiscountRate() * barray[i].getPrice()))+"원");
		}

	}

}
