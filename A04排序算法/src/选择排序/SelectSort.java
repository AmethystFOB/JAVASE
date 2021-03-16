package 选择排序;

/**
 * n个数 必须执行 n-1次
 * 若以是有序数列，则效率低下
 *
 * 执行过程：
 *          小循环：每次以第一个数作为最小值与其他数比较，最终把最小值放到第一位
 *          大循环：执行 n-1 次
 */
public class SelectSort {
    public static void main(String[] args) {
        int array[] = {7,8,6,4,5,3,1,9,2};
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            /*小循环：经过一轮循环后确定第一个位置的最小值*/
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            /*把本次小循环得到的最小值交换，放到第一位*/
            if (minIndex != i) {
                int temp;
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
            System.out.print(array[i]);
        }
    }
}
