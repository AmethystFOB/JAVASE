package 冒泡排序;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args){
        int[] array = {5,9,8,4,1,6,7,3,2};
        int temp;
        /*大循环：控制执行轮数*/
        for (int j = 0; j < array.length-1; j++) {
            /*先假设数列是有序的*/
            boolean flag = true;
            /*小循环：执行一轮冒泡*/
            for (int i = 0; i < array.length-1-j; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                    /*如果发生了交换，说明是无序的*/
                    flag = false;
                }
            }
            /*如果一次小循环后，没有交换，则已是有序序列，退出*/
            if (flag == true) {
                System.out.println(Arrays.toString(array));
                break;
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}
