package Three;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZhaoXiaoDemo2 {
	public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myfile.txt");
        FileOutputStream fos = new FileOutputStream("myfile_cp2.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] data = new byte[1024 * 10];
        int len = -1;
        while ((len = bis.read(data)) != -1) {//��ÿ�ζ�ȡ�ֽڲ�����-1����ʾ��������
            bos.write(data);//ʹ�û�����д
        }
        System.out.println("myfile����Ϊmyfile_cp2���");
        fis.close();
        fos.close();
    }
}
