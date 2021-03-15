package service;

import util.Constants;

/**
 * 实现类
 */
public class GuessGame implements GameInterface{

    private Player computerPlayer;  //电脑玩家
    private Player userPlayer;      //用户玩家
    private Judger judger;          //裁判
    private int count;              //局数（当前为第几局）
    @Override
    public void initGame() {
        computerPlayer = new ComputerPlayer("AI");
        userPlayer = new UserPlayer("张三");
        judger = new Judger();
        count = 1;
    }

    @Override
    public void startGame() {
        while (true){
            //用户玩家出拳
            int userValue = userPlayer.getInputValue();
            //电脑玩家出拳
            int computerValue = computerPlayer.getInputValue();
            //输出两方的出拳
            System.out.println(userPlayer.getName()+":"+ Constants.NAMES[userValue]+"\t"+computerPlayer.getName()+":"+Constants.NAMES[computerValue]);
            //裁判进行比较
            int result = Judger.compare(computerValue,userValue);
            //更具本局结果修改WIN_COUNT（取得胜利的局数）
            modifyWinCount(result);
            //输出本局比赛结果
            showResult(result);
            //判断游戏是否结束
            if (computerPlayer.getWinCount() == Constants.WIN_COUNT||userPlayer.getWinCount() == Constants.WIN_COUNT) {
                break;
            }
        }
    }

    private void showResult(int result) {
        //本局输赢
        switch(result){
            case 0:
                System.out.println("本局：和局！");
                break;
            case 1:
                System.out.println("本局："+computerPlayer.getName()+"赢！");
                break;
            case -1:
                System.out.println("本局："+userPlayer.getName()+"赢！");
                break;
            default:
                break;
        }
        //当前比分
        System.out.println("当前比分为："+userPlayer.getName()+"\t"+userPlayer.getWinCount()+":"+computerPlayer.getWinCount()+"\t"+computerPlayer.getName());
    }

    private void modifyWinCount(int result) {
        if (result == 1) {  //电脑赢
            computerPlayer.setWinCount(computerPlayer.getWinCount()+1);
        }else if (result == -1) {  //玩家赢
            userPlayer.setWinCount(userPlayer.getWinCount()+1);
        }
    }

    @Override
    public void endGame() {
        System.out.println("==============================================");
        //最终比分
        System.out.println("最终比分："+"\n"+"\t\t"+userPlayer.getName()+"\t"+userPlayer.getWinCount()+":"+computerPlayer.getWinCount()+"\t"+computerPlayer.getName());
        //最终胜利
        if (computerPlayer.getWinCount() == Constants.WIN_COUNT) {
            System.out.println(computerPlayer.getName()+"胜利！");
        }else if (userPlayer.getWinCount() == Constants.WIN_COUNT) {
            System.out.println(userPlayer.getName()+"胜利！");
        }else {
            System.out.println("平局！");
        }
    }
}
