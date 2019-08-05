package JavaDemo;

import java.io.File;
import java.io.FileInputStream;
public class io {
    public static void main(String[] args) {
        //*****************使用缓冲数组的方法读取文件内容，提高效率*****************
        //1.明确数据源
        File file=new File("d:\\textRsp1.txt","utf-8");
        //2.构建流的对象
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream(file);
            //3.声明缓冲数组
            int count=100;
            byte[] bytes = new byte[count];
            int readCount = 0; // 已经成功读取的字节的个数
            while (readCount < count) {
                readCount += fileInputStream.read(bytes, readCount, count - readCount);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //*****************使用缓冲数组的方法读取文件内容，提高效率*****************
    }
}
