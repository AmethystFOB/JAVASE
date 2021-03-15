package service;

import util.MyUtil;

/**
 * 电脑玩家类
 */
public class ComputerPlayer extends Player{
    public ComputerPlayer(String name) {
        super(name);
    }

    //获取随机手势
    @Override
    public int getInputValue(){
        value = MyUtil.getRandom(2);

        return value;
    }
}
