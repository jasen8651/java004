package java001_1;

public class OuterAnonymous{
	
	private int x;
	
	OuterAnonymous_InnerAnoymous ts = new OuterAnonymous_InnerAnoymous() {
		
		@Override
		void prn() {
			System.out.println("prn");
		}
	};
	
	public void display() {
		ts.prn();
		
		new OuterAnonymous_InnerAnoymous() {
			@Override
			void prn() {
				System.out.println("prn2");
			}
		}.prn();
	}//end display()
}//end
