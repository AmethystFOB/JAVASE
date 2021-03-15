package service;

/**
 * 裁判类
 */
public class Judger {
    /**
     * 若返回值为 0则平 ；1电脑赢 ；-1玩家赢
     * @param computerValue 电脑出拳
     * @param userValue     玩家出拳
     * @return 0 1 -1
     */
    public static int compare(int computerValue, int userValue){
        if (computerValue == userValue) {
            return 0;
        }else if (computerValue == 0) {
            if (userValue == 1) {
                return 1;
            }else {return -1;}
        }else if (computerValue == 1){
            if (userValue == 0) {
                return -1;
            }else {return 1;}
        }else if (computerValue == 2) {
            if (userValue == 0) {
                return 1;
            }else {return -1;}
        }else {
            return 10;
        }
    }
}
