package java011_casting.part04;

public class Java112_binding {

	public static void main(String[] args) {
		LgTv lg = new LgTv("LG");
		proccess(lg);

		SamsungTv ss = new SamsungTv("SAMSUNG");
		proccess(ss);

	} // end main()

	// 결합도(의존도)가 낮아졌다.
	public static void proccess(HomeTv tv) {
		tv.turnOn();
		tv.soundUp();
		if (tv instanceof SamsungTv) {
			SamsungTv stv = (SamsungTv) tv;
			stv.move();
		} else if (tv instanceof LgTv) {
			LgTv ltv = (LgTv) tv;
			ltv.call();
		}
		
	} // end proccess()

} // end class
