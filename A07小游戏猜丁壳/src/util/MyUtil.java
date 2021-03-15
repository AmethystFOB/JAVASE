package util;

import java.util.Random;

/**
 * 工具类
 */
public class MyUtil {
    /**
     * 获取 [0到max]随机值
     * @param max 最大值
     * @return 返回随机[0,max]
     */
    public static int getRandom(int max){//输出[0,max]
        return new Random().nextInt(max+1);
    }

    /**
     * 获取 [min,max]随机值
     * @param min 最小值
     * @param max 最大值
     * @return 返回随机 [min,max]
     */
    public static int getRandom(int min,int max){//输出 [min,max]
        return (int) (Math.random()*(max-min+1)+min);
    }

//    /**
//     * 测试方法
//     * @param args
//     */
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.print(getRandom(2));
////            System.out.print(getRandom(3,9));
//        }
//    }
}
