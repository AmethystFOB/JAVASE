package 使用File创建删除文件or文件夹;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("D:/practiceDemo/JavaSE/FileOperation/fileDemo.txt");

        if (file.exists()) {
            file.delete();
        }else {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
//                parentFile.mkdir();   //只能创建一级
                parentFile.mkdirs();    //可创建多级
            }

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
