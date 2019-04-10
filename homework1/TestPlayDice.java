import java.util.*;

public class TestPlayDice {
    public static boolean testThreeKind() {
        return false;
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
