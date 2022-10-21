package java001;

import java.awt.Point;

public class main031 {

	
		/*
		 * 선형 리스트 
		 * 순서 리스트, 자료 간에 순서를 갖는 리슽, 선형 이스트에서 원소를 나열한 순서는 원소드르이 순서가 된다.
		 */
	private	Object[] sale = new Object[3];
		private int Pointer=0;
		public main031() {
			
		}
		public void add(Object element) {
			if(sale.length==Pointer) {
				Object[] arr = new Object[sale.length*2];
				System.arraycopy(sale, 0, arr, 0, sale.length);
			}
			
			sale[Pointer++]=element;
		}

	}


