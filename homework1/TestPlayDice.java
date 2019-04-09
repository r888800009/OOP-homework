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
        Vector<Integer> dice = new Vector(); // save random number

        // add test data
        int result = 55;
        for (int i = 1; i <= 10; i++) dice.add(i);

        // test
        if (PlayDice.sum(dice) == result)
            return true;
        else
            return false;
    } // sum

    public static void main(String[] args) {
        testThreeKind();
        testStraight();
        testPair();
        testSum();

    } // main

} // TestPlayDice class
