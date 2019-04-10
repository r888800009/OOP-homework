/*
 * 10627108 陳文捷 10612150 林詠翔 資訊二甲
 * UTF-8
 */

import java.util.*;

public class TestPlayDice {
    static Dice dice = new Dice(0);

    public static int testKind() {
        int[] case1 = {1, 1, 1};
        dice.set(case1);
        if (dice.isKind(3) != true)
            return 1;

        int[] case2 = {1, 1, 1, 1};
        dice.set(case2);
        if (dice.isKind(3) == true)
            return 2;

        int[] case3 = {1, 2, 3};
        dice.set(case3);
        if (dice.isKind(3) == true)
            return 3;

        int[] case4 = {2, 2, 3};
        dice.set(case4);
        if (dice.isKind(3) == true)
            return 4;

        int[] case5 = {3, 3, 3};
        dice.set(case5);
        if (dice.isKind(3) != true)
            return 5;

        int[] case6 = {1, 1, 1, 1};
        dice.set(case6);
        if (dice.isKind(4) != true)
            return 6;

        int[] case7 = {1, 1, 1, 1, 2};
        dice.set(case7);
        if (dice.isKind(5) == true)
            return 7;

        return 0;
    } // isSthreeKind

    public static boolean testStraight() {
        int[] case1 = {1, 1, 1};
        dice.set(case1);
        if (dice.isStraight() == true)
            return false;

        int[] case2 = {1, 2, 3};
        dice.set(case2);
        if (dice.isStraight() != true)
            return false;

        int[] case3 = {3, 2, 1};
        dice.set(case3);
        if (dice.isStraight() != true)
            return false;

        int[] case4 = {1, 4, 5};
        dice.set(case4);
        if (dice.isStraight() == true)
            return false;

        return true;
    } // isStraight

    public static int testPair() {
        int[] case1 = {1, 1, 1};
        dice.set(case1);
        if (dice.isPair() == true)
            return 1;

        int[] case2 = {1, 3, 5};
        dice.set(case2);
        if (dice.isPair() == true)
            return 2;

        int[] case3 = {1, 1, 2, 2};
        dice.set(case3);
        if (dice.isPair() != true)
            return 3;

        int[] case4 = {1, 2, 2, 1};
        dice.set(case4);
        if (dice.isPair() != true)
            return 4;

        int[] case5 = {1, 1, 1, 2, 2};
        dice.set(case5);
        if (dice.isPair() != true)
            return 5;

        int[] case6 = {1, 1, 1, 1, 2};
        dice.set(case6);
        if (dice.isPair() != true)
            return 6;

        return 0;
    } // isPair

    public static boolean testSum() {
        // add test data
        int[] case1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        dice.set(case1);
        int result = 55;

        // test
        if (dice.sum() == result)
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
