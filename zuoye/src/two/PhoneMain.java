package two;

public class PhoneMain {
	public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("��Ϊ");
        phone.setCpu("I7");
        phone.setMemory("8G");
        phone.setScreenSzie(15);
        System.out.println("Ʒ�ƣ�" + phone.getBrand() + "  Cpu:" + phone.getCpu() + "  Memory: " + phone.getMemory() + "  ScreenSzie:" + phone.getScreenSzie());
    }
}
