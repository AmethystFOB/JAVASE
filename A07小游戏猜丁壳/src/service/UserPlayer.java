package service;

import java.util.Scanner;

/**
 * 用户玩家
 */
public class UserPlayer extends Player{
    public UserPlayer(String name) {
        super(name);
    }

    @Override
    public int getInputValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：0-石头；1-剪刀；2-布");
        value = sc.nextInt();

        return value;
    }
}
