package service;

/**
 * 玩家类
 */
public abstract class Player {
    public String name; //玩家姓名
    public int value;   //手势 0 1 2
    public int winCount;    //取得胜利的局数

    public abstract int getInputValue();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }


}
