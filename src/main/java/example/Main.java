package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toString();
        String arr[] = str.split(" ");
        int a[] = new int[arr.length];
        for(int j = 0; j < a.length; j++)
        {
            a[j] = Integer.parseInt(arr[j]);

        }
        GuessNumebr guessNumebr = new GuessNumebr(new AnswerGenerator());
        if(guessNumebr.isLegal(a)){
            System.out.println(guessNumebr.guess(a));
        }
        else {
            System.out.println("Wrong Input，Input again");
        }


    }
}
