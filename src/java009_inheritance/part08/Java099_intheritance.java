package java009_inheritance.part08;

public class Java099_intheritance {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.setWater(1000);
		fe.setSpeed(100);
		fe.setColor("RED");
		fe.waterSperad();
		System.out.println(fe.toString());
		
		OwnerEngine oe = new OwnerEngine();
		oe.setSeat(8);
		oe.infomation();
		oe.setSpeed(80);
		oe.setColor("BLACK");
		System.out.println(oe.toString());
		
	}

}
