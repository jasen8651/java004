package java001_1;

import java001_1.OuterStatic.InnerStatic;

public class OuterStatic_main {

	public static void main(String[] args) {
		OuterStatic.call();
		OuterStatic.InnerStatic inner = new OuterStatic.InnerStatic();
		inner.prn();

	}

}
