package java_thread;

public class Wahroom {
	void openDoor(String name) {
		System.out.println(name + "님이 입장");
		for (int i = 0; i < 50000; i++) {
			if (i % 1000 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					System.out.println(ex.toString());
				}
				System.out.println(name + "님이 업무 보는 중");
			}

		}
		System.out.println(name + "퇴장함");

	}
}
