import java.util.*;

public class TestPlayDice {
    public static int testKind() {
        int[] case1 = {1, 1, 1};
        if (PlayDice.isKind(case1, 3) != true)
            return 1;

        int[] case2 = {1, 1, 1, 1};
        if (PlayDice.isKind(case2, 3) == true)
            return 2;

        int[] case3 = {1, 2, 3};
        if (PlayDice.isKind(case3, 3) == true)
            return 3;

        int[] case4 = {2, 2, 3};
        if (PlayDice.isKind(case4, 3) == true)
            return 4;

        int[] case5 = {3, 3, 3};
        if (PlayDice.isKind(case5, 3) != true)
            return 5;

        int[] case6 = {1, 1, 1, 1};
        if (PlayDice.isKind(case6, 4) != true)
            return 6;

        int[] case7 = {1, 1, 1, 1, 2};
        if (PlayDice.isKind(case7, 5) == true)
            return 7;

        return 0;
    } // isSthreeKind

    public static boolean testStraight() {
        int[] case1 = {1, 1, 1};
        if (PlayDice.isStraight(case1) == true)
            return false;

        int[] case2 = {1, 2, 3};
        if (PlayDice.isStraight(case2) != true)
            return false;

        int[] case3 = {3, 2, 1};
        if (PlayDice.isStraight(case3) != true)
            return false;

        int[] case4 = {1, 4, 5};
        if (PlayDice.isStraight(case4) == true)
            return false;

        return true;
    } // isStraight

    public static int testPair() {
        int[] case1 = {1, 1, 1};
        if (PlayDice.isPair(case1) == true)
            return 1;

        int[] case2 = {1, 3, 5};
        if (PlayDice.isPair(case2) == true)
            return 2;

        int[] case3 = {1, 1, 2, 2};
        if (PlayDice.isPair(case3) != true)
            return 3;

        int[] case4 = {1, 2, 2, 1};
        if (PlayDice.isPair(case4) != true)
            return 4;

        int[] case5 = {1, 1, 1, 2, 2};
        if (PlayDice.isPair(case5) != true)
            return 5;

        int[] case6 = {1, 1, 1, 1, 2};
        if (PlayDice.isPair(case6) != true)
            return 6;

        return 0;
    } // isPair

    public static boolean testSum() {
        // add test data
        int[] dice = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = 55;

        // test
        if (PlayDice.sum(dice) == result)
            return true;
        else
            return false;
    } // sum

    public static void main(String[] args) {
        int result;
        if ((result = testKind()) != 0)
            System.out.println("Kind fail:" + result);

        if (!testStraight())
            System.out.println("Straight fail");

        if ((result = testPair()) != 0)
            System.out.println("Pair fail:" + result);

        if (!testSum())
            System.out.println("sum fail");

    } // main

} // TestPlayDice class
