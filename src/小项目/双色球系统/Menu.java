package 小项目.双色球系统;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*声明一个二维数组 用于存储多注彩票*/
        int[][] lotteries = new int[0][];
        int[] luckyNum = new int[0];
        exit:
        while (true){
            System.out.println("*      欢迎使用双色球系统     *");
            System.out.println("********请输入菜单选项********");
            System.out.println("*        1:购买双色球       *");
            System.out.println("*        2:查看我的双色球    *");
            System.out.println("*        3:查看开奖         *");
            System.out.println("*        4:查看中奖         *");
            System.out.println("*        5:退出系统         *");
            System.out.println("***************************");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("*        购买双色球        *");
                    /*输入购买的注数*/
                    System.out.println("请输入要购买的注数:");
                    int zs = sc.nextInt();
                    /*创建一个二维数组 用于存储多注彩票*/
                    lotteries = new int[zs][];
                    /*由程序循环生成彩票*/
                    for (int i = 0; i < zs; i++) {
                        lotteries[i] = LotteryUtil.getLottery();
                    }
                    System.out.println(zs+"注双色球号码购买成功，请前往2查看");
                    /*将多注彩票存储在程序中*/
                    break;
                case 2:
                    /*购买双色球*/
                    if (lotteries.length != 0) {
                        /*遍历二维数组*/
                        for (int[] lottery:
                                lotteries) {
                            for (int x=0 ;x<lottery.length ;x++) {
                                if (x == 5) {
                                    System.out.print(lottery[x]+"\t|\t");
                                }else {
                                    System.out.print(lottery[x]+"\t");
                                }
                            }
                            System.out.println();
                        }
                    }else {
                        System.out.println("请客官先购买双色球，再查看！");
                    }
                    break;
                case 3:
                    /*判断是否购买了双色球*/
                    /*再生成一注双色球作为中奖号码*/
                    if (lotteries.length != 0) {
                        /*生成中奖号码*/
                        luckyNum = LotteryUtil.getLottery();
                        /*输出中奖号码，即遍历一维数组*/
                        for (int x=0 ;x<luckyNum.length ;x++) {
                            if (x == 5) {
                                System.out.print(luckyNum[x] + "\t|\t");
                            } else {
                                System.out.print(luckyNum[x] + "\t");
                            }
                        }
                        System.out.println();
                    }else {
                        System.out.println("客官请先购买双色球，再查看开奖号码！");
                    }
                    break;
                case 4:
                    if (lotteries.length == 0||luckyNum.length == 0) {
                        System.out.println("请先购买并查看中奖号码后再选择此功能");
                    }else{
                        int sum = 0;
                        for (int[] lottery :
                                lotteries) {
                            sum+=LotteryUtil.isWin(luckyNum,lottery);
                        }
                        System.out.println("共花费"+(lotteries.length)*2+"元，获奖"+sum+"元");
                    }
                    break;
                case 5:
                    System.out.println("*        5:客观常来啊！       *");
                    break exit;
                default:
                    System.out.println("*        6:客观不可以！       *");
            }
        }
    }


}
