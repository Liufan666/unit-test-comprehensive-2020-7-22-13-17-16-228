package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int time=0;time<6;time++){


            String str = sc.nextLine().toString();
            String arr[] = str.split(" ");
            int a[] = new int[arr.length];
            for(int j = 0; j < a.length; j++)
            {
                a[j] = Integer.parseInt(arr[j]);

            }
            GuessNumeber guessNumeber = new GuessNumeber(new AnswerGenerator());
            if(guessNumeber.isLegal(a)){
                System.out.println(guessNumeber.guess(a));
            }
            else {
                System.out.println("Wrong Input，Input again");
            }

        }
        sc.close();


    }
}
