import java.util.*;

public class PlayDice {
    public static boolean isThreeKind(int[] dice) {
        int first = dice[0];
        int count = 0;

        for (int i : dice) {
            if (i != first)
                return false;
            count++;
        } // for

        if (count == 3)
            return true;
        else
            return false;
    } // isThreeKind

    public static boolean isStraight(int[] dice) {
        Arrays.sort(dice);

        int pre = dice[0];
        for (int i = 1; i < dice.length; i++) {
            if (pre + 1 != dice[i])
                return false;
            pre = dice[i];
        } // for

        return true;
    } // isStraight

    public static boolean isPair(int[] dice) {
        int bucket[] = {0, 0, 0, 0, 0, 0};

        for (int i : dice) bucket[i - 1]++;

        for (int i : bucket)
            if (i != 0 && i % 2 == 0)
                return true;

        return false;
    } // isPair

    public static int sum(int[] dice) {
        int result = 0;

        for (int i : dice) result += i;

        return result;
    } // sum

    public static void main(String[] args) {
        // save random number
        int[] dice = new int[3];

        // get random number
        for (int i = 0; i < dice.length; i++) dice[i] = (int) (Math.random() * 6 + 1);

        if (isThreeKind(dice))
            System.out.println("three of a kind");

        else if (isStraight(dice))
            System.out.println("straight");

        else if (isPair(dice))
            System.out.println("pair");

        else
            System.out.println("sum = " + sum(dice));

    } // main

} // PlayDice class
