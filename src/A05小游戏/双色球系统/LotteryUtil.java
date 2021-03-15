package A05小游戏.双色球系统;

import java.util.Arrays;

public class LotteryUtil {
    /*
    双色球规则:
        前六位 红球 1-33 不能重复 升序排列
        最后一位 蓝球 1-16 可以和前六位重复
    一等奖：7个号码相符（6个红色球号码和1个蓝色球号码）（红色球号码顺序不限，下同）；
    二等奖：6个红色球号码相符；
    三等奖：5个红色球号码和1个蓝色球号码相符；
    四等奖：5个红色球号码或4个红色球号码和1个蓝色球号码相符；
    五等奖：4个红色球号码或3个红色球号码和1个蓝色球号码相符；
    六等奖：1个蓝色球号码相符（有无红色球号码相符均可）。
     */

    /**
     * 判断是否中奖的方法
     * 输出彩票 判断几等奖 输出并返回金额
     * @param luckyNum 开奖的号码
     * @param lottery 已购买的号码
     * @return 返回的金额
     */
    public static int isWin(int[] luckyNum ,int[] lottery){
        /*判断前六位有几位相同*/
        int red = 0;    //红球相同的个数
        for (int i = 0; i < 6; i++) {
            System.out.print(lottery[i]+"\t");
            if (luckyNum[i] == lottery[i]){
                red++;
            }
        }
        int blue = luckyNum[6] ==lottery[6]?1:0;    //蓝球相同的个数
        System.out.print("\t|\t"+lottery[6]+"\t");
        int money = 0;
        if (red == 6&&blue==1) {
            money =5000000;
            System.out.println("一等奖5000000元");
        }else if (red == 6) {
            money = 1250000;
            System.out.println("二等奖1250000元");
        }else if (red == 5&&blue == 1) {
            money = 3000;
            System.out.println("三等奖3000元");
        }else if ((red == 5)||(red+blue==5)) {
            money = 200;
            System.out.println("四等奖200元");
        }else if (red == 4||red + blue == 4){
            money =10;
            System.out.println("五等奖10元");
        }else if (red == 0&&blue==1) {
            money=5;
            System.out.println("六等奖5元");
        }else {
            System.out.println("未中奖~请再接再厉！！！");
        }
        return money;
    }

    /**
     * 获取一注双色球
     * @return 返回数组一注双色球
     */
    public static int[] getLottery(){
        int[] lottery = new int[6];
        for (int i = 0; i < 6; i++) {
            /*生成随机数*/
            int num = (int)(Math.random()*33+1);
            /*判断生成的数字是否已经包含了*/
            while (isContain(lottery,num)){
                /*若重复则重新生成数字*/
                num = (int)(Math.random()*33+1);
            }
            lottery[i] = num;
        }
        /*数组工具类排序*/
        Arrays.sort(lottery);
        int[] lottery2 = new int[7];
        /*数组的复制*/
        System.arraycopy(lottery,0,lottery2,0,6);
        /*开始处理第七位*/
        lottery2[6] = (int)(Math.random()*16+1);
        return lottery2;
    }

    /**
     * 该方法用于判断给定的数组中是否包含制定的元素
     * @param arr 给定的数组
     * @param b 要查找的元素
     * @return  找到返回true 未找到返回false
     */
    public static boolean isContain(int[] arr ,int b){
        boolean flag = false;
        for (int x:
                arr){
            if(x==b){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
