package A03数组索引位插入;

import java.util.Scanner;

public class ArrInsert {
    public static void main(String[] args){
        int[] originArray = {2,4,6,8,10};
        Scanner position = new Scanner(System.in);
        System.out.println("The original array is:");
        for (int out:
        originArray){
            System.out.print(out+"\t");         /* 2 4 6 8 10 */
        }                                       /* 0 1 2 3 4 */
        System.out.println("please input the position of integer for insert:");
        int index = position.nextInt();         /* the position of integer 4*/
        Scanner num = new Scanner(System.in);
        System.out.println("Please input the integer:");
        int number = num.nextInt();             /* the integer 7 */
        int[] newArray = new int[originArray.length+1];
//        for (int i = 0; i < index-1; i++) {     /* i < 3 */
//            newArray[i] = originArray[i];       /* Warning:(20, 9) Manual array copy手动数组复制 */
//        }
        /* Use System.arraycopy to replace Manual array copy 使用系统数组复制代替手动数组复制 */
        System.arraycopy(originArray,0,newArray,0,index-1);
                        /* 原数组,原数组起始位置,目标数组,目标数组起始位置,要复制的长度 */
        newArray[index-1] = number;            /* 2,4,6,7 */
                                               /* 0,1,2,3 */
        for (int i = index; i < newArray.length; i++) { /* i = 4 ;i < 6 */
            newArray[i] = originArray[index-1];
        }
        for (int result :
                newArray) {
            System.out.print(result+"\t");
        }
    }
}
