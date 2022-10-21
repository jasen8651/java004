package java001;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Phone implements Serializable{
	String name;
	int price;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return String.format("%s %d\n",name, price);
	}
}
public class main028 {

	public static void main(String[] args) {
		File file = new File("src/java001/phone.dat");
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		FileInputStream fi =null;
		ObjectInputStream oi=null;
		
		try {
			fs = new FileOutputStream(file);
			os= new ObjectOutputStream(fs);
			
			Phone p = new Phone("android", 5000);
			os.writeObject(p);
			System.out.println("객체저장");
			os.writeObject(new String("java"));
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			os.close();
			fs.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
		
		try {
			fi = new FileInputStream(file);
			oi = new ObjectInputStream(fi);
			Phone p = (Phone)oi.readObject();
			System.out.println(p.toString());
			String sn = (String)oi.readObject();
			System.out.println(sn.toString());
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oi.close();
				fi.close();	
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
// 직렬화 : 객체를 연속적인 데이터로 변환하는 기능
// 