import java.util.*;

public class PlayDice {
    public static boolean isThreeKind(Vector<Integer> dice) {
        return false;
    } // isThreeKind

    public static boolean isStraight(Vector<Integer> dice) {
        return false;
    } // isStraight

    public static boolean isPair(Vector<Integer> dice) {
        return false;
    } // isPair

    public static int sum(Vector<Integer> dice) {
        int result = 0;

        for (int i : dice) result += i;

        return result;
    } // sum

    public static void main(String[] args) {
        Vector<Integer> dice = new Vector(); // save random number
        int n = 0;

        for (int i = 0; i < 3; i++) // get random number
        {
            n = (int) (Math.random() * 6 + 1);
            dice.add(n);
        } // for

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
