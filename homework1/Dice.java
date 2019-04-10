import java.util.*;

public class Dice {
    int[] dice;

    public Dice(int size) {
        // save random number
        dice = new int[size];

        // get random number
        for (int i = 0; i < dice.length; i++) dice[i] = (int) (Math.random() * 6 + 1);
    }

    public Dice(int[] data) {
        dice = data;
    }

    public void set(int[] data) {
        dice = data;
    }

    public boolean isKind(int count) {
        int first = dice[0];

        for (int i : dice) {
            if (i != first)
                return false;
            count--;
        } // for

        if (count == 0)
            return true;
        else
            return false;
    } // isThreeKind

    public boolean isStraight() {
        Arrays.sort(dice);

        int pre = dice[0];
        for (int i = 1; i < dice.length; i++) {
            if (pre + 1 != dice[i])
                return false;
            pre = dice[i];
        } // for

        return true;
    } // isStraight

    public boolean isPair() {
        int bucket[] = {0, 0, 0, 0, 0, 0};

        for (int i : dice) bucket[i - 1]++;

        for (int i : bucket)
            if (i != 0 && i % 2 == 0)
                return true;

        return false;
    } // isPair

    public int sum() {
        int result = 0;

        for (int i : dice) result += i;

        return result;
    } // sum
}
