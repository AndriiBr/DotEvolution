package Version2;

import java.util.Random;

import static Version2.DotsHub.getSingleton;

public class GeneralDot {
    public double EvolutionFactor = 1.0;
    public int PositionX = WorkField.generalWindowSize/2;
    public int PositionY = WorkField.generalWindowSize/2;
    public int XMoveChoice;
    public int PreviousXMoveChoice;
    public int YMoveChoice;
    public int PreviousYMoveChoice;
    public int LifeTime = 10000;

    public static int getRandomIndexToMove(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public void move() {
        /*Dot has 10% chance to move up(forward) and 10% to move down(backward).
        80% chance that dot will not move.
        (for each direction separately).
         */
        int[] nums = new int[] { -1, 0, 0, 0, 0, 0, 0, 0, 0, 1 };

        XMoveChoice = getRandomIndexToMove(nums);
        YMoveChoice = getRandomIndexToMove(nums);

        //Collision check Dot <> Dot. Dots cannot move to occupied positions.
        for (int j = 0; j < getSingleton().getDotHub().size(); j++) {
            if (getSingleton().getDotHub().size() > 2) {
                if (PositionX + XMoveChoice != getSingleton().getDotHub().get(j).PositionX
                        && PositionY + YMoveChoice != getSingleton().getDotHub().get(j).PositionY) {
                    PositionX = PositionX + XMoveChoice;
                    PositionY = PositionY + YMoveChoice;
                    break;
                }
            }
        }
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
