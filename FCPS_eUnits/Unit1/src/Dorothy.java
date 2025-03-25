import edu.fcps.karel2.Display;

public class Dorothy extends Athlete {
    public Dorothy() {
        super(2, 2, Display.EAST, 0);
    }

    public boolean findPath() {
        // 檢查目前是否站在 beeper 上
        return nextToABeeper();
    }

    public void followPath() {
        // 嘗試從四個方向找下一個 beeper
        for (int i = 0; i < 4; i++) {
            if (frontIsClear()) {
                move();
                if (nextToABeeper()) {
                    return;  // 找到下一個 beeper
                }
                // 回頭原地，方向不變
                turnAround();
                move();
                turnAround();
            }
            turnLeft();  // 換方向繼續嘗試
        }
    }
}
