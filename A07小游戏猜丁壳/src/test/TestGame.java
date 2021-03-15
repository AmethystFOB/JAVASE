package test;

import service.GameInterface;
import service.GuessGame;

/**
 * 启动类
 */
public class TestGame {
    public static void main(String[] args) {
        GameInterface gameInterface = new GuessGame();
        gameInterface.initGame();
        gameInterface.startGame();
        gameInterface.endGame();
    }
}
