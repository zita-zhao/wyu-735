package two;

public class PhoneMain {
	public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("»ªÎª");
        phone.setCpu("I7");
        phone.setMemory("8G");
        phone.setScreenSzie(15);
        System.out.println("Æ·ÅÆ£º" + phone.getBrand() + "  Cpu:" + phone.getCpu() + "  Memory: " + phone.getMemory() + "  ScreenSzie:" + phone.getScreenSzie());
    }
}
