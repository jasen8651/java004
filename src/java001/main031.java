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
				sale =arr;
			}
			
			
			sale[Pointer++]=element;
		}

		/*
		 * public Object get(int index) { try { if(index<=Pointer) throw new
		 * ArrayIndexOutOfBoundsException(index); }catch (ArrayIndexOutOfBoundsException
		 * ex) { System.out.println(ex.toString()); } return sale[index];
		 * 
		 * }
		 */public Object get(int index) throws ArrayIndexOutOfBoundsException{
			if(index<Pointer)
				return sale[index];
			else
				throw new ArrayIndexOutOfBoundsException(index);
		}
		
		public int size() {
			return Pointer;
		}
		public Object remove(int index) {
			Object obj = sale[index];
			for(int i=index; i<Pointer; i++) {
				sale[i] =sale[i+1];
			}
			Pointer--;
			return obj;
		}

	}


