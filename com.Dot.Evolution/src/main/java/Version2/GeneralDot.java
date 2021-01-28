package Version2;

import java.util.Random;

public class GeneralDot {
    public double EvolutionFactor = 1.0;
    public int PositionX = 101;
    public int PositionY = 101;
    public int XMoveChoice;
    public int PreviousXMoveChoice;
    public int YMoveChoice;
    public int PreviousYMoveChoice;
    public int LifeTime = 200;

    public static int getRandomIndexToMove(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public void move() {
        int[] nums = new int[] { -4, 0, 4 };
        XMoveChoice = getRandomIndexToMove(nums);
        YMoveChoice = getRandomIndexToMove(nums);

        PositionX = PositionX + XMoveChoice;
        PositionY = PositionY + YMoveChoice;
        evolutionCheck();
    }

    public void evolutionCheck() {

        if (PreviousXMoveChoice == XMoveChoice || PreviousYMoveChoice == YMoveChoice) {
            EvolutionFactor += 0.1;
        }
        PreviousXMoveChoice = XMoveChoice;
        PreviousYMoveChoice = YMoveChoice;

        LifeTime--;
    }
}
