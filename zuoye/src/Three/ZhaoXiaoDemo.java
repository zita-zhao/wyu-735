package Three;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZhaoXiaoDemo {
	public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("myfile.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("myfile_cp.txt");
        byte[] data = new byte[1024 * 10];
        int len = -1;
        //当每次读取字节不等于-1，表示都有数据
        while ((len = fileInputStream.read(data)) != -1) {
            fileOutputStream.write(data);
        }
        System.out.println("myfile复制为myfile_cp完成");
        fileInputStream.close();
        fileOutputStream.close();
	}
}
