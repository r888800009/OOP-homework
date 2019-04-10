import java.util.*;

public class TestPlayDice {
    public static boolean testThreeKind() {
        int[] case1 = {1, 1, 1};
        if (PlayDice.isThreeKind(case1) != true)
            return false;

        int[] case2 = {1, 1, 1, 1};
        if (PlayDice.isThreeKind(case2) == true)
            return false;

        int[] case3 = {1, 2, 3};
        if (PlayDice.isThreeKind(case3) == true)
            return false;

        int[] case4 = {2, 2, 3};
        if (PlayDice.isThreeKind(case4) == true)
            return false;

        int[] case5 = {3, 3, 3};
        if (PlayDice.isThreeKind(case5) != true)
            return false;

        return true;
    } // isSthreeKind

    public static boolean testStraight() {
        return false;
    } // isStraight

    public static boolean testPair() {
        return false;
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
        if (!testThreeKind())
            System.out.println("ThreeKind fail");

        if (!testStraight())
            System.out.println("Straight fail");

        if (!testPair())
            System.out.println("Pair fail");

        if (!testSum())
            System.out.println("sum fail");

    } // main

} // TestPlayDice class
