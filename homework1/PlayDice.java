/*
 * 10627108 陳文捷 10612150 林詠翔 資訊二甲
 * UTF-8
 */

import java.util.*;

public class PlayDice {
    public static void main(String[] args) {
        Dice dice = new Dice(3);

        if (dice.isKind(3))
            System.out.println("three of a kind");

        else if (dice.isStraight())
            System.out.println("straight");

        else if (dice.isPair())
            System.out.println("pair");

        else
            System.out.println("sum = " + dice.sum());

    } // main

} // PlayDice class
