package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {//todo
        Scanner sc = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber(new AnswerGenerator());
        for (int time = 0; time < 6; time++) {
            String str = sc.nextLine().toString();
            String arr[] = str.split(" ");
            int a[] = new int[arr.length];
            for (int j = 0; j < a.length; j++) {
                a[j] = Integer.parseInt(arr[j]);
            }

            if (guessNumber.isLegal(a)) {
                System.out.println(guessNumber.guess(a));
            } else {
                System.out.println("Wrong Input，Input again");
            }

        }
        sc.close();
    }
}
