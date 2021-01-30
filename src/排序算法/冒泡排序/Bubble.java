package 排序算法.冒泡排序;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args){
        int[] array = {5,9,8,4,1,6,7,3,2};
        int temp;
        /*控制执行轮数*/
        for (int j = 0; j < array.length-1; j++) {
            /*执行一轮冒泡*/
            for (int i = 0; i < array.length-1-j; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}
