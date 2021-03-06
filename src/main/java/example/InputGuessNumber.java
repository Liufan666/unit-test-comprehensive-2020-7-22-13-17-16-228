package example;

import java.util.Scanner;

public class InputGuessNumber {
    public static int[] getInput(Scanner sc) {
        String str = sc.nextLine().toString();
        String arrayString[] = str.split(" ");
        int arrayInt[] = new int[arrayString.length];
        for (int index = 0; index < arrayInt.length; index++) {
            arrayInt[index] = Integer.parseInt(arrayString[index]);
        }
        return arrayInt;
    }

    public static boolean isWin(int[] input, GuessNumber guessNumber) {
        if (guessNumber.guess(input) == "4A0B") {
            return true;
        }
        return false;
    }
}
